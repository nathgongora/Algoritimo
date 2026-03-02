//Elabore um algoritmo para calcular a área de um círculo. O cálculo é
//pi*raio ^ 2. Considere pi = 3,14.

package com.mycompany.exercicio3_variaveis;

import java.util.Scanner;

public class Exercicio3_Variaveis {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        
        double raio = 0; double pi = 3.14;
        
        System.out.println("Bem vindo a Calculadora de Area de Circulos");
        System.out.println("Informe o valor do raio:");
        raio = sc.nextDouble();
        
        double area = pi*raio*raio;
        
        System.out.println("O valor da area e: " + area);
    }
}
