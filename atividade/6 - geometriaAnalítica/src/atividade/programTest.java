package atividade;

import java.util.Scanner;

public class programTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Ponto2d point1 = new Ponto2d();
		
		System.out.println("X = " + point1.getCoordinateX());
		System.out.println("Y = " + point1.getCoordinateY());
		
		System.out.println("Digite a coordenada x:");
		int x = scanner.nextInt();
		System.out.println("Digite a coordenada y:");
		int y = scanner.nextInt();
		
		Ponto2d point2 = new Ponto2d(x,y);
		System.out.println("X = " + point2.getCoordinateX());
		System.out.println("Y = " + point2.getCoordinateY());
		
		System.out.println("Digite a coordenada:");
		int coordinate = scanner.nextInt();
		Ponto2d point3 = new Ponto2d(coordinate);
		System.out.println("X = " + point3.getCoordinateX());
		System.out.println("Y = " + point3.getCoordinateY());
		
		Ponto2d point4 = new Ponto2d(point2);
		System.out.println("X = " + point4.getCoordinateX());
		System.out.println("Y = " + point4.getCoordinateY());
		
		scanner.close();
	}

}
