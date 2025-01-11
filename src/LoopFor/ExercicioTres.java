package LoopFor;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        /*
    3. Fatorial de um Número:Peça ao usuário para inserir um número e calcule seu fatorial utilizando
    o laço for.
     */
    // Cria um objeto Scanner para ler a entrada do usuário
    Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor e descubra seu Fatorial: ");
        int valorDigitado = scan.nextInt(); // Lê o número inteiro digitado pelo usuário
        int fatorial = 1; // Inicializa a variável 'fatorial' com 1,
        // O loop começa de 1 e vai até o valor digitado pelo usuário
        if (valorDigitado <0 ){
            System.out.println("Fatorial não definido para números negativos.");
        } else {
            for (int i = 1; i <= valorDigitado; i++) {
                fatorial *= i; // Multiplica o valor atual de 'fatorial' pelo valor de 'i'
                }
            // Após o loop, exibe o resultado do fatorial calculado
            System.out.println("O valor fatorial de "+ valorDigitado + " é :" +fatorial);
        }
        scan.close();
    }

}
