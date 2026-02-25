
package com.mycompany.exerciciosaula5;

import java.util.Scanner;

public class ExerciciosAula5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int idade = 0;
        
        //Informando a Idade
        System.out.println("Sistema de Classificacao Etaria");
        
        System.out.println("Digite a sua idade:");
        idade = sc.nextInt();
        
        //Classificando em Criança, Adolescente, Jovem Adulto, Adulto ou Idoso
        if (idade < 12) {
            System.out.println("Voce e Criança");
        } else if (idade >= 12 && idade < 18) {
            System.out.println("Voce e um Adolescente");
        } else if (idade >= 18 && idade < 30) {
            System.out.println("Voce e um Adulto Jovem");
        } else if (idade >= 30 && idade < 60) {
            System.out.println("Voce e um Adulto");
        } else {
            System.out.println("Voce e um idoso");
        }
    }
}
