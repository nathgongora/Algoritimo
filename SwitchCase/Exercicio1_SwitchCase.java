package com.mycompany.exercicio1parte2aula5;

import java.util.Scanner;

public class Exercicio1Parte2Aula5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int opção = 0;
        double num1 = 0.0;
        double num2 = 0.0;
        
        
        //Menu de Opções
        System.out.println("Bem vindo a Calculadora");
        System.out.println("Escolha a operacao seguindo as seguintes opcoes:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.println("Digite aqui a sua escolha: ");
        opção = sc.nextInt();
        
        //Realizando as Operações
        switch (opção) {
            case 1: //soma
                System.out.println("Digite o primeiro numero: ");
                    num1 = sc.nextDouble();
                System.out.println("Digite o segundo numero: ");
                    num2 = sc.nextDouble();
                double resultadoSoma = num1 + num2;
                System.out.println("O resultado e: " + resultadoSoma);
                break;
             
            case 2: //subtração
                System.out.println("Digite o primeiro numero: ");
                    num1 = sc.nextDouble();
                System.out.println("Digite o segundo numero: ");
                    num2 = sc.nextDouble();
                double resultadoSubtracao = num1 - num2;
                System.out.println("O resultado e: " + resultadoSubtracao);
                break;
            
            case 3: //multiplicação
                System.out.println("Digite o primeiro numero: ");
                    num1 = sc.nextDouble();
                System.out.println("Digite o segundo numero: ");
                    num2 = sc.nextDouble();
                double resultadoMultiplicacao = num1 * num2;
                System.out.println("O resultado e: " + resultadoMultiplicacao);
                break;
            
            case 4: //divisão
                System.out.println("Digite o primeiro numero: ");
                    num1 = sc.nextDouble();
                System.out.println("Digite o segundo numero: ");
                    num2 = sc.nextDouble();
                double resultadoDivisao = num1 / num2;
                System.out.println("O resultado e: " + resultadoDivisao);
                break;
                
            default:
                System.out.println("ERRO");
        }
    }
}
