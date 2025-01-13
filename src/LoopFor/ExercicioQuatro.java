package LoopFor;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
    /*
    4. Imprimir Números Pares de 1 a N: Peça ao usuário um número N e imprima todos os números pares
     entre 1 e N.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero e veja o numeros pares ate o numero escolhido: ");
        int valorDigitado = scan.nextInt();

        if (valorDigitado<0){
            System.out.print("Valor digitado é negativo");
        }else {
            for (int i = 2; i <= valorDigitado ; i+=2) {
                System.out.print(i+", ");

            }
        }
    }
}
