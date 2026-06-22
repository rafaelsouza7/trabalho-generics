package ProjetoLists;


public class ListaVetor<T> {
    private T[] itens;
    private int tamanho; // tamanho das coisas adicionadas

    @SuppressWarnings("unchecked")
    public ListaVetor() {
        this.itens = (T[]) new Object[10]; // cast com vetor de tamanho 10
        this.tamanho = 0;
    }

    public int size() {
        return this.tamanho;
    }

    @SuppressWarnings("unchecked")
    private void aumentarCapacidade() {
        if (this.tamanho == this.itens.length) {
            T[] elementosNovos = (T[]) new Object[this.itens.length * 2]; // Cria um vetor com o dobro do tamanho quando enche
            for (int i = 0; i < this.itens.length; i++) { // Copia os itens do vetor velho pro novo
                elementosNovos[i] = this.itens[i];
            }

            this.itens = elementosNovos; // Troca o vetor velho pelo novo
        }
    }

    // Adiciona no final
    public void add(T valor) {
        this.aumentarCapacidade(); // Verifica se precisa aumentar o espaço do vetor
        this.itens[this.tamanho] = valor; // Coloca o valor na primeira posição vazia o mesmo valor de tamanho
        this.tamanho++;
    }

    // Adiciona por posição
    public void add(T valor, int pos) {
        if (pos < 0 || pos > this.tamanho) { // Não pode ser menor que zero e nem maior que a lista
            throw new IllegalArgumentException("Posição inválida para adição: " + pos);
        }

        this.aumentarCapacidade(); // Verifica se precisa aumentar o espaço do vetor

        for (int i = this.tamanho - 1; i >= pos; i--) { // Empurra os elementos para a frente pra abrir espaço
            this.itens[i + 1] = this.itens[i];
        }

        this.itens[pos] = valor; // Colocamos o valor na posição
        this.tamanho++;
    }

    public T get(int pos) {
        if (pos < 0 || pos >= this.tamanho) { // Não pode ser menor que zero e nem maior ou igual a lista
            throw new IllegalArgumentException("Posição inválida para busca: " + pos);
        }
        return this.itens[pos]; // Devolve o item do vetor
    }

    // Remove por posição
    public T remove(int pos) {
        if (pos < 0 || pos >= this.tamanho) {
            throw new IllegalArgumentException("Posição inválida para remoção: " + pos);
        }

        T itemRemovido = this.itens[pos]; // Guarda o item que vai ser removido pra conseguir retornar ele no final

        for (int i = pos; i < this.tamanho - 1; i++) { // Empurra os elementos da direita para a esquerda para cobrir o espaço
            this.itens[i] = this.itens[i + 1];
        }

        this.itens[this.tamanho - 1] = null; // Retira a última vaga repetida com o null

        this.tamanho--;
        return itemRemovido;
    }

    // Remove por valor
    public boolean remove(T valor) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.itens[i] != null && this.itens[i].equals(valor)) {
                this.remove(i);
                return true;
            }
        }
        return false;
    }

}
