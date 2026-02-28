// Elabore um algoritmo para calcular a média de 3 valores, porém
//utilizando apenas duas variáveis.
package com.mycompany.exercicio1_variaveis;

import java.util.Scanner;

public class Exercicio1_Variaveis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double valores = 0.0; double resultado = 0.0;
        
        System.out.println("Bem vindo a Calculadora de Medias");
        System.out.println("Digite o primeiro valor:");
        valores = sc.nextDouble();
        resultado += valores;
        
        System.out.println("Digite o segundo valor:");
        valores = sc.nextDouble();
        resultado += valores;
        
        System.out.println("Digite o terceiro valor:");
        valores = sc.nextDouble();
        resultado += valores;
        
        resultado = resultado /3;
        
        System.out.println("A media desses valores e: " + resultado);
    }
}
