//Escreva um algoritmo que atribua um valor a uma variável num,
//calcule o quadrado desse número e atribua o resultado à mesma
//variável num, e imprima num.

package com.mycompany.exercicio4_variaveis;

import java.util.Scanner;

public class Exercicio4_Variaveis {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double num;
        
        System.out.println("Indique um valor e te diremos o valor dele ao quadrado:");
        num = sc.nextDouble();
        
        num = num*num;
        
        System.out.println("O resultado e: " + num);
    }
}
