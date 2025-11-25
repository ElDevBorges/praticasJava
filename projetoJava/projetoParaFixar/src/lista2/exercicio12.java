package lista2;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value;
		
		System.out.print("Informe um número: ");
		value = input.nextInt();
		
		if (value % 2 == 0) {
			System.out.print("O valor informado é par");
		} else {
			System.out.print("O valor informado é ímpar");
		}

	}

}
