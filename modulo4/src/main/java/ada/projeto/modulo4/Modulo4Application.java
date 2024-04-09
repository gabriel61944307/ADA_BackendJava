package ada.projeto.modulo4;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.io.Reader;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Modulo4Application implements CommandLineRunner {

	private final JdbcTemplate jdbcTemplate;

	public Modulo4Application(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(Modulo4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Reader reader = Files.newBufferedReader(Paths.get("src/lista_de_produtos.csv"));
		CsvToBean<Produto> csvToBean = new CsvToBeanBuilder<Produto>(reader)
				.withType(Produto.class)
				.withIgnoreLeadingWhiteSpace(true).build();

		List<Produto> produtos = csvToBean.parse();

		produtos.forEach(this::insertProduto);

		System.out.println("Quantidade de categorias de produtos: " + Q1());

		System.out.println("\nQuantidade de produtos em cada categoria: ");
		Q2().forEach(mapCategoria -> System.out.println(mapCategoria.get("categoria") + ": " + mapCategoria.get("total_quantidade")));

		System.out.println("\nMedia do preco de todos os produtos: " + Q3());

		List<Produto> produtosComBaixoEstoque = getProdutos().stream().
				filter(produto -> produto.getQuantidade() < 3)
						.toList();
		System.out.println("\nProdutos com baixo estoque:\n" + produtosComBaixoEstoque);
	}


	public List<Produto> getProdutos(){
		String sql = "select * from produtos";
		RowMapper<Produto> rowMapper = ((rs, rowNumber) -> new Produto(
				rs.getLong("id"),
				rs.getString("nome"),
				rs.getInt("quantidade"),
				rs.getString("categoria"),
				rs.getBigDecimal("preco")
		));

		List<Produto> listaProdutos = jdbcTemplate.query(sql, rowMapper);

		return listaProdutos.stream().toList();
	}

	public void insertProduto(Produto produto) {
		if (produto != null) {
			String sql = "INSERT INTO produtos (nome, quantidade, categoria, preco) VALUES (?, ?, ?, ?)";
			this.jdbcTemplate.update(sql, produto.getNome(), produto.getQuantidade(), produto.getCategoria(), produto.getPreco());
		} else {
			System.out.println("Tentativa de salvar produto nulo não valida");
		}
	}

	public Integer Q1(){
		return this.jdbcTemplate.queryForObject("SELECT COUNT(DISTINCT categoria) from produtos;", Integer.class);
	}
	public List<Map<String, Object>> Q2(){
		return this.jdbcTemplate.queryForList("SELECT categoria, SUM(quantidade) AS total_quantidade FROM produtos GROUP BY categoria;");
	}
	public BigDecimal Q3(){
		return this.jdbcTemplate.queryForObject("SELECT AVG(preco) FROM produtos;", BigDecimal.class);
	}
}
