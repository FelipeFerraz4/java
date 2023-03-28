package ligadefutebol;

public class Clube {
	
	String nome;
	int pontos = 0;
	int saldoGols = 0;
	
	public Clube() {
		
	}
	public Clube(String nome) {
		this.nome = nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getName() {
		return this.nome;
	}
	public int getPontos() {
		return this.pontos;
	}
	public int getSaldoGols() {
		return this.saldoGols;
	}
	
	
	public void ganhar(int saldoGols) {
		this.saldoGols += saldoGols;
		this.pontos += 3;
	}
	public void empatar() {
		this.pontos += 1; 
	}
	public void perder(int saldoGols) {
		this.saldoGols += saldoGols;
	}
	
	
	public String toString() {
		String data = "Time: " + this.nome +
				"\nPontos: " + this.pontos +
				"\nSaldo de gols: " + this.saldoGols;
		return data;
	}
	
}
