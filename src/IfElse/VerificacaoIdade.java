package IfElse;

import java.util.Scanner;

public class VerificacaoIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }
    public static String getIdade(int idade){
        if (idade>= 0 && idade<18){
            return "Voce é menor de idade";
        }else{
           return "Você é maior de idade";
        }
    }

}
