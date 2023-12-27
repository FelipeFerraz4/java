package atividade;

import java.util.Scanner;

public class Bank {
	    public static void main(String args[]) {
	    	Scanner scanner = new Scanner(System.in);
	    	float saldo = 0;
	        int close = 0;
	        do{
	          System.out.println("Escolha o numero correspondente ao comando.");
	          System.out.println("1 - Saldo");
	          System.out.println("2 - Saque");
	          System.out.println("3 - Deposito");
	          System.out.println("4 - Sair");
	          System.out.println("Digite aqui: ");
	          close = scanner.nextInt();
	          if (close == 1) {
	        	  System.out.printf("Saldo = %.2f\n", saldo);
	          }
	          else if (close == 2) {
	        	  System.out.println("Digite o valor do saque: ");
	        	  float saque = scanner.nextFloat();
	        	  if (saldo >= saque) {
	        		  saldo = saldo - saque;  
	        	  }
	        	  else {
	        		  System.out.println("Saldo insuficiente.");
	        	  }
	          }
	          else if (close == 3) {
	        	  System.out.println("Digite o valor do deposito: ");
	        	  float deposito = scanner.nextFloat();
	        	  saldo = saldo + deposito;
	          }
	          else if (close == 4 ) {
	        	  break;
	          }
	          else {
	        	  System.out.println("Escolha invalida.");
	          }
	        }while( close != 4 );
	        scanner.close();
	    }
}
