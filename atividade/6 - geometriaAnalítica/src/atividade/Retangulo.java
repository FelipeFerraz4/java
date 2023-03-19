package atividade;

public class Retangulo {
	
	Ponto2d point1 = new Ponto2d();
	Ponto2d point2 = new Ponto2d();
	int maiorX, maiorY, menorX, menorY;
	
	//Melhoria: criar uma verificação se os construtores recebem o mesmos x ou y
	public Retangulo(Ponto2d point1, Ponto2d point2) {
		this.point1 = point1;
		this.point2 = point2;
		
		verificarMaior(point1.getCoordinateX(), point2.getCoordinateX(), 0);
		verificarMaior(point1.getCoordinateY(), point2.getCoordinateY(), 1);
	}
	public Retangulo(int coordX1, int coordY1, int coordX2, int coordY2) {
		this.point1.setCoordinateX(coordX1);
		this.point1.setCoordinateY(coordY1);
		this.point2.setCoordinateX(coordX2);
		this.point2.setCoordinateY(coordY2);
		
		verificarMaior(coordX1, coordX2, 0);
		verificarMaior(coordY1, coordY2, 1);
		
	}
	
	//Função recebe dois números e o eixo(x = 0 e y = 1)
	public void verificarMaior(int num1, int num2, int eixo) {
		if (eixo == 0) {
			if(num1 > num2) {
				 this.maiorX = num1;
				 this.menorX = num2;
			}
			else {
				 this.maiorX = num2;
				 this.menorX = num1;
			}
		}
		else {
			if(num1 > num2) {
				 this.maiorY = num1;
				 this.menorY = num2;
			}
			else {
				 this.maiorY = num2;
				 this.menorY = num1;
			}
		}
	}
	public boolean pontoContido(Ponto2d point) {
		if (this.maiorX >= point.getCoordinateX() && point.getCoordinateX() >= this.menorX) {
			if(this.maiorY >= point.getCoordinateY() && point.getCoordinateY() >= this.menorY) {
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	public void calculaInterseccao(Retangulo r1) {
		int tamanhoVetor1 = ((this.maiorX-this.menorX)+1) * ((this.maiorX-this.menorY)+1);
		int tamanhoVetor2 = ((r1.maiorX-r1.menorX)+1) * ((r1.maiorX-r1.menorY)+1);
		Ponto2d [] pontos1 = new Ponto2d[tamanhoVetor1]; 
		Ponto2d [] pontos2 = new Ponto2d[tamanhoVetor2];
		//coloquei o tamanho igual ao tamanhoVetor1 pois o array teria o tamanho da intesecção
		// com isso, o maior tamanho seria no máximo o tamanho de um dos retangulo.
		Ponto2d [] pontosInterseccao = new Ponto2d[tamanhoVetor1];
		int count = 0;
		
		for(int x = this.maiorX; x >= this.menorX;x--) {
			for(int y = this.maiorY; y >= this.menorY;y--) {
				Ponto2d p1 = new Ponto2d(x,y);
				pontos1[count] = p1;
				System.out.println(pontos1[count].getCoordinateX()+" "+pontos1[count].getCoordinateY());
				count++;
			}
		}
		 
		count = 0;
		
		for(int x = r1.maiorX; x >= r1.menorX;x--) {
			for(int y = r1.maiorY; y >= r1.menorY;y--) {
				Ponto2d p1 = new Ponto2d(x,y);
				pontos2[count] = p1;
				System.out.println(pontos2[count].getCoordinateX()+" "+pontos2[count].getCoordinateY());
				count++;
			}
		}
		
		count = 0;
		
		for(int i = 0; i < tamanhoVetor1;i++) {
			for(int j = 0; j < tamanhoVetor2;j++) {
				if (pontos1[i].getCoordinateX() == pontos2[j].getCoordinateX() &&
						pontos1[i].getCoordinateY() == pontos2[j].getCoordinateY()) {
					Ponto2d p = new Ponto2d(pontos1[i].getCoordinateX(),pontos1[i].getCoordinateY());
					pontosInterseccao[count] = p;
					System.out.println(pontosInterseccao[count].getCoordinateX()+ " " +pontosInterseccao[count].getCoordinateY());
					count++;
				}
			}
		}
		System.out.println(count);
		
		
		
		
	}
}
