package casting;

public class ExercicioCasting {
    public static void main(String[] args) {
        String linha = "*-----------------------Linha-------------------------------*";

        // Exercicio de fixação
        // Declare uma variável do tipo double e atribua a ela um valor decimal (por exemplo, 10.75).
        double valor = 120.12;
        System.out.println("O valor de double é: " + valor);
        System.out.println(linha);

        // Realize o casting explícito dessa variável para um tipo int e imprima o valor resultante.
        int valorInteiro1 = (int) valor;
        System.out.println("O valor original de double é: " + valor);  // Corrigido para mostrar o valor original de 'double'
        System.out.println("Valor após casting explícito para int: " + valorInteiro1);  // Valor convertido de double para int
        System.out.println(linha);

        // Declare uma variável do tipo int e atribua a ela um valor inteiro (por exemplo, 25).
        int valorInteiro = 35;
        int valorAtribuido = valorInteiro;  // O casting implícito ocorre automaticamente ao atribuir o valor de 'int' para 'int'
        System.out.println("O valor de int é: " + valorInteiro);
        System.out.println("Valor após casting implícito para int (não há alteração): " + valorAtribuido);  // Não há conversão aqui, apenas atribuição
        System.out.println(linha);

        // Realize o casting implícito dessa variável para um tipo double e imprima o valor resultante.
        double doubleImplicito = valorInteiro;  // O valor de 'int' é automaticamente convertido para 'double'
        System.out.println("O valor de int é: " + valorInteiro);
        System.out.println("Valor após casting implícito para double: " + doubleImplicito);  // Casting implícito
        System.out.println(linha);

        // Declare uma variável do tipo long e atribua um valor grande a ela (por exemplo, 1500000L).
        long valorLong = 1500000L;
        double doubleLongParaDouble = valorLong;  // O casting implícito de long para double não precisa de casting explícito
        System.out.println("O valor de long é: " + valorLong);
        System.out.println("Valor após casting implícito para double: " + doubleLongParaDouble);  // Casting implícito de long para double
    }
}
