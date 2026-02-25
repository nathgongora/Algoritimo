// crie uma função que receba um numero e retorne o seu dobro
package com.mycompany.exercicio1_aula11;

import java.util.Scanner;

public class Exercicio1_Aula11 {
    
    static double dobrarValores(double valor){
        double resultado = valor*2;
        return resultado; 
    }
    static void digiteValor (){
        System.out.println("Digite o Valor: ");
    }
    static void mensagem (String mensagem){
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
     
        double entrada = 0.0;
        
        digiteValor();
        entrada = sc.nextDouble();
        
        double valorDobrado = dobrarValores(entrada);
        
        mensagem("Valor dobrado = " + valorDobrado);
    }
}
