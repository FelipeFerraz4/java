package atividade;

public class Ponto2d {
	
	int coordinateX = 0;
	int coordinateY = 0;
	
	public Ponto2d() {
	}
	public Ponto2d(int coordinateX, int coordinateY) {
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
	}
	public Ponto2d(int coordinate) {
		this.coordinateX = coordinate;
		this.coordinateY = coordinate;
	}
	public Ponto2d(Ponto2d point2) {
		this.coordinateX = -(point2.getCoordinateX());
		this.coordinateY = -(point2.getCoordinateY());
	}
	
	public int getCoordinateX() {
		return this.coordinateX;
	}
	public int getCoordinateY() {
		return this.coordinateY;
	}
	
}
