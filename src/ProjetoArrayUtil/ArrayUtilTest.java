package ProjetoArrayUtil;

public class ArrayUtilTest {

    public static void main(String[] args) {
        testarCount();
        testarMax();
        testarMin();
    }

    private static void testarCount() {
        System.out.println("Testes do método count");

        Integer[] numeros = {1, 2, 3, 2, 4, 2, 5};
        int qtdDoisInt = ArrayUtil.count(numeros, 2);
        System.out.println("Ocorrências de 2 em " + java.util.Arrays.toString(numeros)
                + " = " + qtdDoisInt + " (esperado: 3)");

        int qtdDezInt = ArrayUtil.count(numeros, 10);
        System.out.println("Ocorrências de 10 em " + java.util.Arrays.toString(numeros)
                + " = " + qtdDezInt + " (esperado: 0)");

        String[] palavras = {"casa", "carro", "casa", "bola", "casa", "rua"};
        int qtdCasaStr = ArrayUtil.count(palavras, "casa");
        System.out.println("Ocorrências de \"casa\" em " + java.util.Arrays.toString(palavras)
                + " = " + qtdCasaStr + " (esperado: 3)");

        int qtdBolaStr = ArrayUtil.count(palavras, "bola");
        System.out.println("Ocorrências de \"bola\" em " + java.util.Arrays.toString(palavras)
                + " = " + qtdBolaStr + " (esperado: 1)");

        System.out.println();
    }

    private static void testarMax() {
        System.out.println("Testes do método max");

        Integer[] numeros = {5, 3, 9, 1, 7};
        System.out.println("Maior de " + java.util.Arrays.toString(numeros)
                + " = " + ArrayUtil.max(numeros) + " (esperado: 9)");

        String[] palavras = {"banana", "abacaxi", "uva", "melancia"};
        System.out.println("Maior de " + java.util.Arrays.toString(palavras)
                + " = " + ArrayUtil.max(palavras) + " (esperado: uva)");

        // Exceção com vetor vazio
        try {
            Integer[] vazio = {};
            ArrayUtil.max(vazio);
            System.out.println("ERRO: deveria ter lançado exceção para vetor vazio");
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção esperada (vetor vazio): " + e.getMessage());
        }

        // Exceção com vetor null
        try {
            ArrayUtil.max((Integer[]) null);
            System.out.println("ERRO: deveria ter lançado exceção para vetor null");
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção esperada (vetor null): " + e.getMessage());
        }

        System.out.println();
    }

    private static void testarMin() {
        System.out.println("===== Testes do método min =====");

        Integer[] numeros = {5, 3, 9, 1, 7};
        System.out.println("Menor de " + java.util.Arrays.toString(numeros)
                + " = " + ArrayUtil.min(numeros) + " (esperado: 1)");

        String[] palavras = {"banana", "abacaxi", "uva", "melancia"};
        System.out.println("Menor de " + java.util.Arrays.toString(palavras)
                + " = " + ArrayUtil.min(palavras) + " (esperado: abacaxi)");

        // Exceção com vetor vazio
        try {
            String[] vazio = {};
            ArrayUtil.min(vazio);
            System.out.println("ERRO: deveria ter lançado exceção para vetor vazio");
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção esperada (vetor vazio): " + e.getMessage());
        }

        // Exceção com vetor null
        try {
            ArrayUtil.min((String[]) null);
            System.out.println("ERRO: deveria ter lançado exceção para vetor null");
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção esperada (vetor null): " + e.getMessage());
        }
    }
}