import view.MenuPrincipal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuPrincipal menu = new MenuPrincipal();
        menu.execute(scanner);
    }
}