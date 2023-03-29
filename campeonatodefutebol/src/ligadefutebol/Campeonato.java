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
		
		int tam = this.times.length;
		for(int i = 0; i < tam; i++) {
		    for(int j = 0; j < tam; j++){
		        jogarPartida(this.times[i], this.times[j]);
		    }   
		}
		
	}
	public void jogarPartida(Clube firstTime, Clube secondTime) {
		
		System.out.println(firstTime.getName() + " " + secondTime.getName());
		
	}
	public Clube[] getClassificacao(){
		
		//Ordenação de vetor de times
		
		return this.times;
	}
	public Clube getCampeao() {
		return this.times[0];
	}
	
}
