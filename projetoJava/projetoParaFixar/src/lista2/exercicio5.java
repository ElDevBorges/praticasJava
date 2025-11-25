package lista2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		double height, base;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a ALTURA do retangulo: ");
		height = input.nextDouble();
		
		System.out.print("Informe a BASE do retangulo: ");
		base = input.nextDouble();
		
		System.out.printf("A area do retangulo é de: %.1f metros ", (height * base));

	}

}
