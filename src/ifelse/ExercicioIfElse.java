package ifelse;

import java.util.Scanner;

public class ExercicioIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/* Exercício: Estruturas Condicionais if e else
   Enunciado: Crie um programa Java que execute as seguintes verificações usando as estruturas condicionais if e else:

    1 - Verifique se um número fornecido pelo usuário é positivo, negativo ou zero.
    2 - Verifique se uma pessoa é maior de idade.
    3 - Verifique se um número é par ou ímpar.
     */

        // 1 - Verifique se um número fornecido pelo usuário é positivo, negativo ou zero.
        System.out.println("Digite um valor: ");
        int valorDigitado = scan.nextInt();

        if (valorDigitado == 0){
            System.out.println("O Valor digitado é igual a zero");

        }else if (valorDigitado >0){
            System.out.println("O Valor digitado é positivo");

        } else {
            System.out.println("O Valor digitado é negativo");
        } scan.close();
    }
}
