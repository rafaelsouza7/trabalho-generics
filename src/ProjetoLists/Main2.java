package ProjetoLists;

// Main pra Lista Vetor

public class Main2 {
    public static void main(String[] args) {
        System.out.println(" TESTANDO A NOSSA LISTAVETOR");

        Lista<String> lista = new ListaVetor<>();

        lista.add("Java");
        lista.add("Python");
        lista.add("C++");
        lista.add("JavaScript");
        lista.add("C#");
        lista.add("PHP");
        lista.add("Ruby");
        lista.add("Go");
        lista.add("Kotlin");
        lista.add("Swift");
        lista.add("Rust");

        System.out.println("-> Tamanho após adicionar 11 itens: " + lista.size()); // Deve mostrar 11

        // Testa o get
        System.out.println("-> Item na posição 0: " + lista.get(0)); // Deve mostrar Java
        System.out.println("-> Item na posição 10: " + lista.get(10)); // Deve mostrar Rust

        // Testa o add por posição
        lista.add("TypeScript", 2); // Coloca "TypeScript" na posição 2 empurrando o C++ para a frente
        System.out.println("\n[Inserindo TypeScript na posição 2...]");
        System.out.println("-> Quem está na pos 2 agora: " + lista.get(2)); // Deve mostrar TypeScript
        System.out.println("-> Quem foi para a pos 3: " + lista.get(3));    // Deve mostrar C++
        System.out.println("-> Novo tamanho da lista: " + lista.size());   // Deve mostrar 12

        // Testa o remove por posição
        String removido = lista.remove(1); // Remove o Python que ta na posição 1
        System.out.println("\n[Removendo por posição...]");
        System.out.println("-> Item removido da pos 1: " + removido);     // Deve mostrar Python
        System.out.println("-> Novo dono da pos 1 (puxado para trás): " + lista.get(1)); // Deve mostrar TypeScript

        // Testa o remove por valor
        System.out.println("\n[Removendo por valor...]");
        boolean removeuPHP = lista.remove("PHP");
        System.out.println("-> Conseguiu remover 'PHP'? " + removeuPHP); // Deve mostrar true

        boolean removeuInexistente = lista.remove("Cobol");
        System.out.println("-> Conseguiu remover 'Cobol'? " + removeuInexistente); // Deve mostrar false

        // Mostra como a lista ficou no final
        System.out.println("\n ESTADO FINAL DA LISTA");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Posição [" + i + "]: " + lista.get(i));
        }
    }
}