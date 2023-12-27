package br.com.bluefox.run;

import java.util.Scanner;
import br.com.bluefox.console.MenuOption;
import br.com.bluefox.contas.Conta;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuOption menu = new MenuOption(scanner);
        Conta cliente1 = new Conta("Guilherme", "981.121.233.-12", 1, 1);
        System.out.println(cliente1.getTitular());
        menu.getMenuPrincipal();
        scanner.close();
    }
}