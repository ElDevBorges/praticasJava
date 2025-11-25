package livroEstruturaDeDados;

public interface Pilha {
	void adicionar (int valor);
	int remover();
	boolean isCheia();
	boolean isVazia();
	int getCapacidade();
	int getSize();
	void limpar();
	void showPilha();
}

