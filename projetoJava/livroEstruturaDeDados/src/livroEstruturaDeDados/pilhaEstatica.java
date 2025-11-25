package livroEstruturaDeDados;

public class pilhaEstatica implements Pilha {
	private int[] dados;
	private int topo = -1;
	
	public pilhaEstatica(int tamanho) {
		dados = new int[tamanho];
	}
	
	@Override
	public boolean isVazia() {
		return topo == -1;
	}
	
	@Override
	public boolean isCheia() {
		return topo == dados.length - 1;
	}
	
	@Override
	public void adicionar(int dado) {
		if (isCheia()) {
			throw new IllegalStateException("Pilha cheia");
			
		}
	topo += 1;
	dados [topo] = dado;
		
	}
	@Override
	public int remover() {
		if (isVazia()) {
			throw new IllegalStateException("Pilha vazia");
		}
	int valor = dados [topo]; //armazena o valor da pilha a ser removido
	dados [topo] = 0; // remove o item da pilha
	topo -= 1; //movimenta o topo da pilha
	return valor; //retorna o valor removido
		
	}
	
	@Override
	public void limpar() {
		topo = -1;
		for (int i = 0; i <= topo; i++) {
			dados [i] = 0;
		}
	}
	
	@Override
	public int getCapacidade() {
		return dados.length;
	}
	
	@Override
	public int getSize() {
		return topo+1;
	}
	
	@Override
	public void showPilha() {
		System.out.print("Pilha: ");
		for (int i = 0; i < dados.length; i++) {
			System.out.print (dados[i] + " ");
		}
	}
}