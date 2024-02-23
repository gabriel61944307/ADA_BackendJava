package CatalogoDeFilmes.view;

public abstract class AbstractMenu {
    private String[] opcoes;

    public AbstractMenu(String[] opcoes){
        this.opcoes = opcoes;
    }

    public void execute(){
        try {
            System.out.println("Escolha uma opção:");
            for (String opcao : opcoes) {
                System.out.println(opcao);
            }
            String value = ScannerSingleton.instance().getScanner().nextLine();
            Integer option = Integer.valueOf(value);

            if (validOption(option)) {
                executeOption(option);
            } else if (option == 0) {
                return;
            } else {
                System.out.println("Opção invalida.");
            }
            execute();
        }
        catch (Exception ex){
            System.out.println("ERRO: " + ex);
            execute();
        }
    }

    protected abstract Boolean validOption(Integer option);
    protected abstract void executeOption(Integer option);
}
