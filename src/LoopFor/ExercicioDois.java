package LoopFor;

import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {
    /*
    2. Tabuada de um Número: Solicite ao usuário um número e imprima a tabuada desse número de 1 a 10.
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um Numero e Veja a tabuada:");
        int n= scan.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(n +" X " + 1 + " = " +(n*i));
        }



    }
}
