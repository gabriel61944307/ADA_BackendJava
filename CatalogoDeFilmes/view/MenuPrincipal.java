package CatalogoDeFilmes.view;

import CatalogoDeFilmes.view.ator.MenuAtor;
import CatalogoDeFilmes.view.diretor.MenuDiretor;

public class MenuPrincipal extends AbstractMenu{
    public MenuPrincipal(){
        super(new String[]{
                "1 - Ator",
                "2 - Diretor",
                "3 - Filme",
                "0 - Sair"
        });
    }

    @Override
    protected Boolean validOption(Integer option) {
        return option >= 0 && option <= 3;
    }

    @Override
    protected void executeOption(Integer option) {
        switch (option){
            case 1: new MenuAtor().execute();
                break;
            case 2: new MenuDiretor().execute();
                break;
            case 3:
                break;
            case 0:
                System.exit(1);
                break;
        }
    }
}
