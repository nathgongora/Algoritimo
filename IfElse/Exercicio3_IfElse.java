package com.mycompany.exercicio3aula5;

import java.util.Scanner;

public class Exercicio3Aula5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double lado1 = 0.0;
        double lado2 = 0.0;
        double lado3 = 0.0;
        
        //Informando os dados
        System.out.println("Bem vindo ao Classificador de Triangulos");
        System.out.println("Insira o valor do primeiro lado");
        lado1 = sc.nextDouble ();
        System.out.println("Insira o valor do segundo lado");
        lado2 = sc.nextDouble();
        System.out.println("Insira o valor do terceiro lado");
        lado3 = sc.nextDouble();
        
        //Classificando em equilátero, isósceles ou escaleno.
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
           
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Esse e um: TRIANGULO EQUILATERO");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Esse e um: TRIANGULO ISOSCELES");
            } else {
                System.out.println("Esse e um: TRIANGULO ESCALENO");
            }
                
            } else {
            System.out.println("ERRO - Os valores informados nao formam um triangulo");
        }
    }
}
