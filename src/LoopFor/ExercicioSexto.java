package LoopFor;

import java.util.Scanner;

public class ExercicioSexto {
    public static void main(String[] args) {
        /*
        6. Contagem de Dígitos de um Número: Solicite ao usuário que insira um número inteiro e calcule a
        quantidade de dígitos desse número utilizando o laço for.
         */

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scan = new Scanner(System.in);

        // Solicita ao usuário um número inteiro
        System.out.print("Digite um numero para saber a quantidade de digitos: ");
        int valorDigitado = scan.nextInt(); // Armazena o número digitado pelo usuário

        // Tornar o número positivo caso seja negativo, pois o sinal não conta como dígito
        valorDigitado = Math.abs(valorDigitado);

        // Inicializa o contador para contar os dígitos
        int contador = 0;

        // Laço for para contar os dígitos do número
        for (int temp = valorDigitado; temp > 0; temp = temp / 10) {
            contador++;  // A cada divisão do número por 10, incrementa o contador
        }

        // Caso o número seja 0, ele tem 1 dígito (trata o caso específico de 0)
        if (valorDigitado == 0) {
            contador = 1;  // O número 0 tem 1 dígito
        }

        // Exibe o número de dígitos
        System.out.println("Quantidade de dígitos: " + contador);

        // Fecha o Scanner para evitar possíveis vazamentos de recursos
        scan.close();
    }
}
