package livroEstruturaDeDados;

public class testePilha {

	public static void main(String[] args) {
		Pilha testPilha = new pilhaEstatica(7);
		
		int capacity= testPilha.getCapacidade();
		
		
		
		for (int i = 0; i < 7; i++) {
			testPilha.adicionar(i);
			
		}
		
		int size = testPilha.getSize();
		
		System.out.printf("Capacidade da pilha: %d \n", capacity);
		
		testPilha.showPilha();
		
		
		System.out.printf("\nTamanho atual: %d", size);
	}

}
