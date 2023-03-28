package ligadefutebol;

public class Campeonato {
	
	Clube [] times;
	
	
	public Campeonato() {
		
	}
	public Campeonato(Clube [] times) {
		this.times = times;
	}
	
	public Clube[] getTimes() {
		return this.times;
	}
	
	public void jogarCampeonato() {
		
		//fazer os encontro dos times e chamar 
		//a função jogarPartida para cada
		
	}
	public void jogarPartida() {
		
		//sortiar o placa e por os ponto nos clubes 
		
	}
	public Clube[] getClassificacao(){
		
		//Ordenação de vetor de times
		
		return this.times;
	}
	public Clube getCampeao() {
		return this.times[0];
	}
	
}
