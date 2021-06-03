package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Enter rectangle width: ");
		double width = entrada.nextDouble();
		System.out.print("Enter rectangle heigth: ");
		double heigth = entrada.nextDouble();
		Rectangle rectangle = new Rectangle(width, heigth);

		System.out.println(rectangle);

		entrada.close();

	}

}
