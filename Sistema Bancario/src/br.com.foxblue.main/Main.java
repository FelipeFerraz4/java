package br.com.foxblue.main;

import java.util.Scanner;

import br.com.foxblue.console.MenuOption;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MenuOption menu = new MenuOption(scanner);
        menu.getMenuPrincipal();
        scanner.close();
    }
}
