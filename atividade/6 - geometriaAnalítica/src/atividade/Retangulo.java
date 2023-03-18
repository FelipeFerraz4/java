package atividade;

public class Retangulo {
	
	Ponto2d point1,point2;
	
	public Retangulo(Ponto2d point1, Ponto2d point2) {
		this.point1 = point1;
		this.point2 = point2;
	}
	public Retangulo(int coordX1, int coordY1, int coordX2, int coordY2) {
		this.point1.setCoordinateX(coordX1);
		this.point1.setCoordinateY(coordY1);
		this.point2.setCoordinateX(coordX2);
		this.point2.setCoordinateY(coordY2);
	}
	
}
