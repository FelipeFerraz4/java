package ligadefutebol;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		int time;
		Scanner scan = new Scanner(System.in);
		System.out.println("digite a quantidade de clubes do torneio:");
		time = scan.nextInt();
		Clube [] c = new Clube[time];
		for (int i = 0; i < time;i++) {
			Clube t = new Clube();
			System.out.printf("Digite o nome %d time: \n", (i+1));
			String nome = scan.next();
			t.setName(nome);
			c[i] = t;
		}
		Campeonato copa = new Campeonato(c);
		copa.jogarCampeonato();
		copa.getClassificacao();
		
		Clube [] times = copa.getTimes();
		
		Clube win = copa.getCampeao();
		System.out.printf("\nWin: %s pontos: %d saldo de gols: %d\n\n", 
		                win.getName(), win.getPontos(), win.getSaldoGols());
		
		int tam = times.length;
		//System.out.println(tam);
		
		for(int i = 0; i < tam; i++) {
			System.out.println("times: " + times[i].getName() + 
					" pontos: " + times[i].getPontos() + 
					" saldo de gols: " + times[i].getSaldoGols());
		}
		
		scan.close();
	}
}
