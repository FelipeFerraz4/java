package br.com.bluefox.console;

import java.util.Scanner;

public class MenuOption {

    Scanner scan;

    public MenuOption(Scanner scanner){
        this.scan = scanner;
    }

    public void getMenuPrincipal() {
        int option = 1;
        do {
            System.out.println("------------------------------------------");
            System.out.println("Operações do programa");
            System.out.println("1 - Login");
            System.out.println("2 - Criar Conta");
            System.out.println("3 - Esqueseu a senha");
            System.out.println("0 - Finalizar Programa");
            System.out.println("Digite a opção escolhida: ");

            option = this.scan.nextInt();

            System.out.println();

            if (option == 0) {
                System.out.println("Fim do Programa");
            } else if (option == 1) {
                System.out.println("Login feito com sucesso");
            } else if (option == 2) {
                System.out.println("Conta criada com sucesso");
            } else if (option == 3) {
                System.out.println("Senha alterada com sucesso");
            } else {
                System.out.println("Opção não é valida");
            }
            System.err.println();
        } while (option != 0);

    }
}
