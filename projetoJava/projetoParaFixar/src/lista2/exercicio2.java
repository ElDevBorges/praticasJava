package lista2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int number1, number2, sum;
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite um numero: ");
		number1 = input.nextInt();
		System.out.print("digite outro numero: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.print("a soma de " + number1 +" + " + number2 + " é igual a " + sum);
		
		

	}

}
