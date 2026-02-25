// Elabore um algoritmo que solicite um número N ao usuário e calcule a soma dos números pares de 1 até N.

package com.mycompany.exercicio3aula6;

import java.util.Scanner;

public class Exercicio3Aula6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int variavelN = 0;
        int somaPares = 0;
       
        System.out.println("Digite um numero e faremos a soma dos numero pares ate o numero indicado");
        variavelN = sc.nextInt();
        
        
        for (int cont = 1; cont <= variavelN; cont++) {
            if (cont % 2 == 0) {
               somaPares = somaPares + cont;
            }  
        }
        
        System.out.println("A soma dos numero pares entre 1 ate " + variavelN + " e = " + somaPares);
    }
}
