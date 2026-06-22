package ProjetoLists;

public class Main3 {
    public static void main(String[] args) {

        System.out.println("--- TESTANDO COM LISTA VETOR (Inteiros) ---");
        Lista<Integer> notas = new ListaVetor<>();
        notas.add(5);
        notas.add(10);
        notas.add(7);
        notas.add(10); // Adicionando outro 10 para testar o count

        System.out.println("Maior nota: " + ListaUtil.max(notas)); // Deve mostrar 10
        System.out.println("Menor nota: " + ListaUtil.min(notas)); // Deve mostrar 5
        System.out.println("Quantas notas 10? " + ListaUtil.count(notas, 10)); // Deve mostrar 2

        System.out.println("\n TESTANDO COM LISTA ENCADEADA");
        Lista<String> nomes = new ListaEncadeada<>();
        nomes.add("Zebra");
        nomes.add("Abelha");
        nomes.add("Macaco");

        // Na ordem alfabética (String já implementa Comparable nativamente)
        System.out.println("Último nome alfabético (Max): " + ListaUtil.max(nomes)); // Deve mostrar Zebra
        System.out.println("Primeiro nome alfabético (Min): " + ListaUtil.min(nomes)); // Deve mostrar Abelha
        System.out.println("Quantas 'Zebra' existem? " + ListaUtil.count(nomes, "Zebra")); // Deve mostrar 1
    }
}
