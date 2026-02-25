package com.mycompany.exercicio2aula5;

import java.util.Scanner;

public class Exercicio2Aula5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double peso = 0.0;
        double altura = 0.0;
       
        // Informando os Dados para Calculo
        System.out.println("Bem vindo ao Calculador de IMC");
        
        System.out.println("Informe o seu peso em kg:");
        peso = sc.nextDouble();
        
        System.out.println("Informe a sua altura em metros:");
        altura = sc.nextDouble();
        
        //Calculo do IMC
        double iMC = peso/(altura * altura);
        System.out.println("Agora vamos calcular o seu IMC");
        System.out.println ("O seu IMC e: " + iMC);
        
        //Classificação em abaixo do peso, normal, sobrepeso ou obeso.
        if (iMC < 18.5) {
            System.out.println("A sua classificacao e: ABAIXO DO PESO");
        } else if (iMC >= 18.5 && iMC < 25) {
            System.out.println("A sua classificacao e: NORMAL");
        } else if (iMC >= 25 && iMC < 30) {
            System.out.println("A sua classificacao e: SOBREPESO");
        } else {
            System.out.println("A sua classificacao e: OBESO");
        }
    }
}
