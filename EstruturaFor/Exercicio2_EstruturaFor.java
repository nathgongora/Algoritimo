//Desenvolva um algoritmo que imprima a tabuada de um número fornecido pelo usuário, indo de 1 a 10.

package com.mycompany.exercicio2aula6;

import java.util.Scanner;

public class Exercicio2Aula6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int numero = 0;
                       
        System.out.println("Vamos aprender a Tabuada?");
        System.out.println("Digite um numero para ver a sua tabuada:");
        numero = sc.nextInt();
        
        for (int cont = 1; cont <= 10; cont++) {
            int resultado = numero * cont;
            System.out.println(numero + " x " + cont + " = " + resultado);   
        }
    }
}
