package lista2;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String [] args) {
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite um valor para ver o seu antecessor: ");
		number = input.nextInt();
		
		System.out.printf("O antecessor de %d é %d", number, (number - 1));
		
		
	}

}
