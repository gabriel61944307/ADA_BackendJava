package CatalogoDeFilmes.view.diretor;

import CatalogoDeFilmes.view.AbstractMenu;
import CatalogoDeFilmes.view.ator.CadastrarAtor;
import CatalogoDeFilmes.view.ator.EditarAtor;
import CatalogoDeFilmes.view.ator.ExcluirAtor;
import CatalogoDeFilmes.view.ator.ListarAtor;

public class MenuDiretor extends AbstractMenu {
    public MenuDiretor() {
        super(new String[]{
                "1 - Cadastrar",
                "2 - Editar",
                "3 - Excluir",
                "4 - Listar",
                "0 - Voltar",
        });
    }

    @Override
    protected Boolean validOption(Integer option) {
        return option >= 1 && option <= 4;
    }

    @Override
    protected void executeOption(Integer option) {
        switch (option){
            case 1: CadastrarDiretor.execute();
                break;
            case 2: EditarDiretor.execute();
                break;
            case 3: ExcluirDiretor.execute();
                break;
            case 4: ListarDiretor.execute();
                break;
        }
    }
}
