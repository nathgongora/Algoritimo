//Contagem de Vogais e Consoantes: Faça um algoritmo que conte o
//número de vogais e consoantes em uma frase inserida pelo usuário.
//Ignore espaços em branco e pontuação. 

package com.mycompany.exercicio1aula7;

import java.util.Scanner;

public class Exercicio1Aula7 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        String frase;
                
        System.out.println("Insira uma frase e te diremos o numero de vogais e consoantes que ela contem:");
        frase = sc.nextLine().toLowerCase();
        
        int vogais = 0;
        int consoantes = 0;
        
        for (int leitura = 0; leitura < frase.length(); leitura++) {
            
            char caractere = frase.charAt(leitura);
            
            if (caractere >= 'a' && caractere <= 'z') {
                
                if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                    vogais++;
                } else {
                consoantes++;
                }
            };            
        }
      
        System.out.println("O numero de vogais e: " + vogais);
        System.out.println("O numero de consoantes e: " + consoantes);  
    }
}
