package lista2;

import java.util.Scanner;

public class exercício11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numbers[];
		String text;
		int value, i;
		int storage;
		int size;
		numbers = new int [5];
		size = numbers.length-1;
		i = 0;

		while (numbers [4] == 0) {
				System.out.print("digite para adicionar ao vetor: ");
				text = input.nextLine();
				
				if (!text.trim().isEmpty()) {
					value = Integer.parseInt(text);
					numbers [i] = value;
					i ++;
				}
			
		};
		
		System.out.print("Vetor: ");
		for (i = 0; i <= size; i++) {
			System.out.printf("%d ", numbers[i]);
		}
		
		System.out.print("\nVetor ordernado em ordem crescente: ");
		for (i = 0; i <= size; i++) {
			for (int j = 0; j <= size; j++) {
				if (numbers [i] < numbers[j]) {
					storage = numbers[i];
					numbers [i] = numbers [j];
					numbers [j] = storage;
				}
			}
		}
		for (i = 0; i <= 4; i++) {
			System.out.printf("%d ", numbers[i]);
		}
	}

}
