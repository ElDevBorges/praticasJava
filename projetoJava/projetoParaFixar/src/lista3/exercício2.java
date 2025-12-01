package lista3;

import java.util.Scanner;

/* 2)Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:
a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado. */

public class exercício2 {

	public static void main(String[] args) {
		String value;
		double weight;
		double fatWeight;
		double tinWeight;
		Scanner input = new Scanner(System.in);
		weight = 0;
		
		while (weight == 0) {
			System.out.print("enter your weight: ");
			value = input.nextLine();
			if (!value.trim().isEmpty()) {
				weight = Double.parseDouble(value);
				
				fatWeight = weight + (weight * 15) / 100;
				tinWeight = weight - (weight * 20) / 100;
				
				System.out.printf("Peso atual: %.2f Kg's", weight);
				System.out.printf("\nSe a pessoa engordar 15%% ficará com: %.2f kg's", fatWeight);
				System.out.printf("\nSe emagrecer 20%% ficará com: %.2f Kg's\n", tinWeight);
			}
		}
		
		
		
		
		
	}

}
