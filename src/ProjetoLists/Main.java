package ProjetoLists;

// Main pra listaEncadeada

public class Main {
    public static void main(String[] args) {
        Lista<String> lista = new ListaEncadeada<>();

        System.out.println("TESTANDO OS MÉTODOS ADD");

        lista.add("Arroz");
        lista.add("Feijão");

        lista.add("Carne", 1);

        System.out.println("Itens adicionados com sucesso!");

        System.out.println("\n TESTANDO O REMOVE POR POSIÇÃO");

        String removido = lista.remove(1);
        System.out.println("Elemento removido da posição 1: " + removido + " (Esperado: Carne)");

        System.out.println("\n TESTANDO O REMOVE POR VALOR");

        boolean removeuFeijao = lista.remove("Feijão");
        System.out.println("Removeu 'Feijão'? " + removeuFeijao + " (Esperado: true)");

        boolean removeuBatata = lista.remove("Batata");
        System.out.println("Removeu 'Batata'? " + removeuBatata + " (Esperado: false)");

        System.out.println("\n TESTANDO A VALIDAÇÃO DE ERRO");

        try {
            lista.remove(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada com sucesso: " + e.getMessage());
        }

        System.out.println("\n TESTANDO O GET E SIZE NA LISTA ENCADEADA");
        lista.add("Macarrão");
        System.out.println("-> Tamanho atual da lista encadeada: " + lista.size()); // Deve mostrar o tamanho correto
        System.out.println("-> Item que ficou na posição 0: " + lista.get(0)); // Deve mostrar o item correto
    }
}