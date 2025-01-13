package LoopFor;

import java.util.Scanner;

public class ExercicioQuinto {
    public static void main(String[] args) {
        /*
        5. Imprimir Números de 1 a N em Ordem Reversa:Peça ao usuário um número N e imprima todos os
        números de N até 1
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero e veja a contagem de numero em ordem reversa: ");

        // Verifica se o usuário digitou um número inteiro
        if (scan.hasNextInt()) {
            int valorDigitado = scan.nextInt();

            // Laço for para contar de valorDigitado até 1
            for (int i = valorDigitado; i > 0; i--) {
                System.out.println(i); // Imprime o valor de i (que vai de N até 1)
            }
        } else {
            // Caso o usuário não digite um número inteiro
            System.out.println("Erro! Você não digitou um número inteiro.");
        }

        scan.close();
    }
}
