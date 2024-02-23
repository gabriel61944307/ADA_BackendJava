package CatalogoDeFilmes.view.ator;

import CatalogoDeFilmes.view.AbstractMenu;

public class MenuAtor extends AbstractMenu {
    public MenuAtor() {
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
            case 1: CadastrarAtor.execute();
                break;
            case 2: EditarAtor.execute();
                break;
            case 3: ExcluirAtor.execute();
                break;
            case 4: ListarAtor.execute();
                break;
        }
    }
}
