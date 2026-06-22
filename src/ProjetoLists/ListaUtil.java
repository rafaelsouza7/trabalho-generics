package ProjetoLists;

public class ListaUtil {
    // <?> é um coringa ilimitado que aceita qualquer coisa
    public static int count(Lista<?> lista, Object valor) {
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            Object item = lista.get(i);
            if (item != null && item.equals(valor)) {
                contador++;
            }
        }
        return contador;
    }

    public static <T extends Comparable<T>> T max(Lista<? extends T> lista) {
        if (lista.size() == 0) {
            return null;
        }

        T maior = lista.get(0); // Assume que o primeiro é o maior

        for (int i = 1; i < lista.size(); i++) {
            T atual = lista.get(i);
            // compareTo retorna > 0 se atual for maior que maior
            if (atual != null && atual.compareTo(maior) > 0) {
                maior = atual;
            }
        }
        return maior;
    }

    public static <T extends Comparable<T>> T min(Lista<? extends T> lista) {
        if (lista.size() == 0) {
            return null;
        }

        T menor = lista.get(0); // Assume que o primeiro é o menor

        for (int i = 1; i < lista.size(); i++) {
            T atual = lista.get(i);
            // compareTo retorna < 0 se atual for menor que menor
            if (atual != null && atual.compareTo(menor) < 0) {
                menor = atual;
            }
        }
        return menor;
    }
}
