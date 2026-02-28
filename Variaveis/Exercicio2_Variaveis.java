//Elabore um algoritmo para calcular a área de um triangulo. Ao final, a
//mensagem que deve ser exibida é: A área do triangulo com base X e
//altura Y é: área”; (base*altura / 2).

package com.mycompany.exercicio2_variaveis;

import java.util.Scanner;

public class Exercicio2_Variaveis {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double base; double altura;
        
        System.out.println("Vamos calcular a area de um triangulo, para isso precisaremos de dois valores: o da base e da altura");
        System.out.println("Informe o valor da base:");
        base = sc.nextDouble();
        System.out.println("Informe o valor da altura:");
        altura = sc.nextDouble();
        
        double area = base*altura/2;
        
        System.out.println("A area do triangulo com base " + base + " e altura " + altura + " e = " + area);
    }
}
