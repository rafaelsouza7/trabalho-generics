package ProjetoLists;

public class TesteFinal {
    public static void main(String[] args) {

        System.out.println(" INICIANDO TESTES FINAIS");

        Lista<String> listaDeFrutas = new ListaEncadeada<>();

        System.out.println("\n Inserindo valores...");
        listaDeFrutas.add("Maçã");
        listaDeFrutas.add("Banana");
        listaDeFrutas.add("Laranja");
        listaDeFrutas.add("Abacaxi");
        listaDeFrutas.add("Banana"); // Adicionando repetido de propósito para testar o count

        System.out.println(" Lista atual:");
        for (int i = 0; i < listaDeFrutas.size(); i++) {
            System.out.println(" Posição " + i + ": " + listaDeFrutas.get(i));
        }

        System.out.println("\n Buscando valores...");
        System.out.println(" Qual item está na posição 2? " + listaDeFrutas.get(2)); // Mostrar Laranja

        System.out.println("\n Removendo valores...");
        boolean removeuMaca = listaDeFrutas.remove("Maçã"); // Removendo por valor
        System.out.println(" Removeu 'Maçã'? " + removeuMaca);

        String frutaRemovida = listaDeFrutas.remove(2); // Removendo por posição
        System.out.println(" Fruta removida da posição 2 (que antes era a 3): " + frutaRemovida); // Mostrar Abacaxi

        System.out.println("\n Utilizando a classe ListaUtil (Coringas)...");

        String valorMaximo = ListaUtil.max(listaDeFrutas);
        String valorMinimo = ListaUtil.min(listaDeFrutas);
        int quantidadeBananas = ListaUtil.count(listaDeFrutas, "Banana");

        System.out.println(" Maior valor (Ordem alfabética - MAX): " + valorMaximo);
        System.out.println(" Menor valor (Ordem alfabética - MIN): " + valorMinimo);
        System.out.println(" Quantidade de vezes que 'Banana' aparece (COUNT): " + quantidadeBananas);

        System.out.println("\n FIM DOS TESTES");
    }
}
