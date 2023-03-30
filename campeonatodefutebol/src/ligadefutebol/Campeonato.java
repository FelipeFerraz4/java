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
		
		System.out.printf("\n%s %d x %d %s", firstTime.getName(), 
		                    firstTimeGols, secondTimeGols, 
		                    secondTime.getName());
		
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
	
	public String getClassificacao(){

		//método bubble sort
		//Melhoria, mudar para um algoritmo de ordenação
		//melhor
		
		int tam = this.times.length - 1;
		Clube swap;
		
		for(int i = 0; i < tam; i++){
		    for(int j = 0; j < tam; j++){
		        if (times[j].getPontos() < times[j+1].getPontos()){
		            swap = times[j+1];
		            times[j+1] = times[j];
		            times[j] = swap;
		        }
		        else if (times[j].getPontos() == times[j+1].getPontos()) {
		            if (times[j].getSaldoGols() < times[j+1].getSaldoGols()) {
		                swap = times[j+1];
		                times[j+1] = times[j];
		                times[j] = swap;
		            }
		        }
		    }
		}
		
		String leaderboard = "";
		
		for(int i = 0; i < tam+1; i++) {
			leaderboard = leaderboard + "\ntimes: " + times[i].getName() + 
					" pontos: " + times[i].getPontos() + 
					" saldo de gols: " + times[i].getSaldoGols();
		}
		
		return leaderboard;
	}
	
	public String getCampeao() {
		return this.times[0].getName();
	}
	
}
