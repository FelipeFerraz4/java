package ligadefutebol;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		int time;
		Scanner scan = new Scanner(System.in);
		System.out.println("digite a quantidade de clubes do torneio:");
		time = scan.nextInt();
		if (scan.hasNextLine()) scan.nextLine();
		Clube [] c = new Clube[time];
		for (int i = 0; i < time;i++) {
			Clube t = new Clube();
			System.out.printf("Digite o nome %d time: \n", (i+1));
			String nome = scan.nextLine();
			t.setName(nome);
			c[i] = t;
		}
		Campeonato copa = new Campeonato(c);
		copa.jogarCampeonato();
		String leaderboard = copa.getClassificacao();
		String win = copa.getCampeao();
		
		System.out.printf("\n\nWin: %s congratulations\n", win);
		
		System.out.println(leaderboard);
		
		scan.close();
	}
}
