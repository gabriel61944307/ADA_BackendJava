package CatalogoDeFilmes.view.filme;

import CatalogoDeFilmes.view.AbstractMenu;

public class MenuFilme extends AbstractMenu {
    public MenuFilme() {
        super(new String[]{
                "1 - Cadastrar",
                "2 - Editar",
                "3 - Excluir",
                "4 - Listar",
                "5 - Listar por nome",
                "0 - Voltar",
        });
    }

    @Override
    protected Boolean validOption(Integer option) {
        return option >= 1 && option <= 5;
    }

    @Override
    protected void executeOption(Integer option) {
        switch (option) {
            case 1:
                CadastrarFilme.execute();
                break;
            case 2:
                EditarFilme.execute();
                break;
            case 3:
                ExcluirFilme.execute();
                break;
            case 4:
                ListarFilme.execute();
                break;
            case 5:
                ListarFilmePorNome.execute();
                break;
        }
    }
}
