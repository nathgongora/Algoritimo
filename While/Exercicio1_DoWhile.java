// controle de comissão de vendedores
// receber nome de vendedores, valor de vendas e porcentagem sobre o valor de vendas (5 vendedores)

package com.mycompany.exercicio1_aula9;

import java.util.Scanner;

public class Exercicio1_Aula9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int qtd = 0;
        double[] valoresVenda = new double[qtd];
        String[] vendedores = new String[qtd];
        int porcentagem = 0;
        double[] comissao = new double[qtd];
        double tmpVendas = 0;
        
        System.out.println("Controle de Comissao dos Vendedores");
        System.out.println("São quantos vendedores?");
        qtd = sc.nextInt();
        System.out.println("Qual a porcentagem de comissao?");
        porcentagem = sc.nextInt();
        
        for (int i = 0; i < qtd; i++) {
        
            System.out.println("Indique o Nome dos vendedores");
            vendedores[i] = sc.nextLine();
            
            do {                
               System.out.println("Indique o Valor de venda:");
               valoresVenda[i] = sc.nextDouble();
            } while (tmpVendas < 0);
            
            valoresVenda[i] = tmpVendas;
        }
        
        for (int i = 0; i < qtd; i++) {
            System.out.println("Vendas de " + vendedores [i] + ":" + valoresVenda[i]);
        }
        
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
