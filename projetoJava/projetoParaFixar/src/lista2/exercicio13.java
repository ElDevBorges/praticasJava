package lista2;

import java.util.Scanner;

/*13) Faça um algoritmo que leia as notas de duas avaliações de um aluno.
Calcule a média aritmética e escrever uma mensagem que informe se o aluno
foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é
aprovado). Escrever também a média calculada.*/



	
public class exercicio13 {
	
	public static double calculateAverage (double n1, double n2, double n3) {
		return n1 + n2 + n3 / 3;
	};
	

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text;
		double value, average;
		double[] notes;
		int i;
		notes = new double[3];
		i = 0;
		
		while (notes[2] == 0) {
			System.out.print("Insira sua nota: ");
			text = input.nextLine();
			if (!text.trim().isEmpty()) {
				value = Double.parseDouble(text);
				notes[i] = value;
				i++;
			}
		}
		
		input.close();
		average = calculateAverage(notes[0], notes[1], notes[2]);
		
		System.out.printf("nota: %.2f", average);
		if (average >= 6) {
			System.out.println("\nAluno aprovado");
		} else {
			System.out.println("\nAluno reprovado");
		}
		

	}
	

}
