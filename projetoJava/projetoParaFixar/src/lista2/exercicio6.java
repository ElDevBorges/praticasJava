package lista2;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		
		
		System.out.print("Digite um numero: ");
		number = input.nextInt();
		
		if (number >= 1) {
			System.out.println("o numero digitado é positivo");
		} else if (number < 0){
			System.out.println("O numero digitado é negativo");
		} else {
			System.out.print("O numero digitado é zero");
		}
		
		
	}

}
