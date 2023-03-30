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
		    	if (i != j){
		    		jogarPartida(this.times[i], this.times[j]);
		    	}
		    }   
		}
		
	}
	
	public void jogarPartida(Clube firstTime, Clube secondTime) {
		int firstTimeGols = (int) ( Math.random() * 5 );
		int secondTimeGols = (int) ( Math.random() * 5 );
		int saldoGols = firstTimeGols - secondTimeGols;
		
		if (firstTimeGols > secondTimeGols) {
			firstTime.ganhar(saldoGols);
			secondTime.perder(-saldoGols);
		}else if(firstTimeGols == secondTimeGols) {
			firstTime.empatar();
			secondTime.empatar();
		}
		else {
			firstTime.perder(saldoGols);
			secondTime.ganhar(-saldoGols);
		}
		
	}
	
	public Clube[] getClassificacao(){
		
		//Ordenação de vetor de times
		
		return this.times;
	}
	
	public Clube getCampeao() {
		return this.times[0];
	}
	
}
