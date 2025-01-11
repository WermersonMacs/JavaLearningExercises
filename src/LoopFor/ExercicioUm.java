package LoopFor;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
    /*1. Soma de Números de 1 a N:Peça ao usuário para inserir um número N e calcule a soma
    de todos os números inteiros de 1 até N usando o laço for.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero N: ");
        int n = scan.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma+=i;


        }
        System.out.println("A soma dos numeros de 1 ate "+n+" é: "+soma);

    }
}
