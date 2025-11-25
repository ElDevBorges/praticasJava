package lista2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		double raiz;
		int number1;
		Scanner input = new Scanner (System.in);
		
		System.out.print("insira um valor para extrair a raiz: ");
		number1 = input.nextInt();
		raiz = Math.sqrt(number1);
		
		
		System.out.printf("a raiz quadrada de %d, é igual a %.0f ", number1, raiz);
		
		

	}

}
