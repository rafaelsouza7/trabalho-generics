package ProjetoLists;

public class ListaEncadeada<T> implements Lista<T>{

    private class No {
        T valor;
        No proximo;

        public No(T valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private No inicio;
    private int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public void add(T valor, int pos) {
        if (pos < 0 || pos > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida. Posição passada: " + pos);
        }

        No novoNo = new No(valor);

        // Se a lista tiver vazia ou for pra adiciona na primeira posição
        if (pos == 0) {
            novoNo.proximo = this.inicio;
            this.inicio = novoNo;
        } else {
            // Vai até a posição anterior que quero inserir
            No atual = this.inicio;
            for (int i = 0; i < pos - 1; i++) {
                atual = atual.proximo;
            }
            novoNo.proximo = atual.proximo; // O novo nó é igual o próximo nó do atual
            atual.proximo = novoNo; // O próximo nó do atual é igual um novo nó
        }

        this.tamanho++;
    }

    public void add(T valor) {
        this.add(valor, this.tamanho);
    }

    public T remove(int pos) {
        if (pos < 0 || pos >= this.tamanho) { // O máximo de tamanho é -1
            throw new IllegalArgumentException("Posição fora do intervalo para remoção: " + pos);
        }

        T valorRemovido;

        // Se for pra remover o primeiro elemento
        if (pos == 0) {
            valorRemovido = this.inicio.valor;
            this.inicio = this.inicio.proximo; // O início pula pro segundo elemento
        } else {
            // Vai até a posição anterior que quero remover
            No atual = this.inicio;
            for (int i = 0; i < pos - 1; i++) {
                atual = atual.proximo;
            }

            // Guardar valor que vai ser removido
            No noParaRemover = atual.proximo;
            valorRemovido = noParaRemover.valor;

            // O atual pula o nó que ta sendo removido
            atual.proximo = noParaRemover.proximo;
        }

        this.tamanho--;
        return valorRemovido;
    }

    public boolean remove(T valor) {
        if (this.inicio == null) {
            return false;
        }

        // Remover valor na primeira posição
        if (this.inicio.valor != null && this.inicio.valor.equals(valor)) {
            this.inicio = this.inicio.proximo;
            this.tamanho--;
            return true;
        }

        // Remover valor no meio ou no final da lista
        No atual = this.inicio;

        while (atual.proximo != null) {
            if (atual.proximo.valor != null && atual.proximo.valor.equals(valor)) {
                atual.proximo = atual.proximo.proximo;
                this.tamanho--;
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

    @Override
    public T get(int pos) {
        if (pos < 0 || pos >= this.tamanho) {
            throw new IllegalArgumentException("Posição inválida para busca: " + pos);
        }

        No atual = this.inicio;

        for (int i = 0; i < pos; i++) {
            atual = atual.proximo;
        }
        return atual.valor;
    }

    @Override
    public int size() {
        return this.tamanho;
    }
}