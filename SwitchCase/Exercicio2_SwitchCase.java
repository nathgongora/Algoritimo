package com.mycompany.exercicio2parte2aula5;

import java.util.Scanner;

public class Exercicio2Parte2Aula5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int opcaoMeses = 0;
        
        //Escolhendo o Mes
        System.out.println("Bem vindo ao Calendario");
        System.out.println("Aqui te diremos os principais eventos do mes escolhido");
        System.out.println("Escolha uma das seguintes opcoes");
        System.out.println("1 - Janeiro");
        System.out.println("2 - Fevereiro");
        System.out.println("3 - Marco");
        System.out.println("4 - Abril");
        System.out.println("5 - Maio");
        System.out.println("6 - Junho");
        System.out.println("7 - Julhoo");
        System.out.println("8 - Agosto");
        System.out.println("9 - Setembro ");
        System.out.println("10 - Outubro");
        System.out.println("11 - Novembro");
        System.out.println("12 - Dezembro");
        System.out.println("Digite aqui a sua escolha: ");
        opcaoMeses = sc.nextInt();
        
        //Mostrando os Eventos
        switch (opcaoMeses) {
            case 1:
                System.out.println("O principal evento de Janeiro e:");
                System.out.println("01/01 - Ano Novo ");
                break;
                
            case 2:
                System.out.println("O principal evento de Fevereiro e: ");
                System.out.println("Carnaval (data variavel)");
                break;
                
            case 3:
                System.out.println("O principal evento de Marco e:");
                System.out.println("08/03 - Dia Internacional da Mulher");
                break;
                
            case 4:
                System.out.println("O principal evento de Abril e:");
                System.out.println("21/04 - Tiradentes ");
                System.out.println("Pascoa (data variavel)");
                break; 
                
            case 5:
                System.out.println("O principal evento de Maio e:");
                System.out.println("07/09 - Dia das Maes (segundo domingo de maio) ");
                break;
                
            case 6:
                System.out.println("O principal evento de Junho e:");
                System.out.println("Corpus Christi (feriado religioso, data móvel)");
                System.out.println("12/06 - Dia dos Namorados ");
                break;
                
            case 7:
                System.out.println("O principal evento de Julho e: ");
                System.out.println("Ferias escolares");
                break;
                
            case 8:
                System.out.println("O principal evento de Agosto e:");
                System.out.println(" Dia dos Pais (segundo domingo de agosto)");
                break;
                
            case 9:
                System.out.println("O principal evento de Setembro e: ");
                System.out.println("07/09 - Independência do Brasil ");
                break;    
                
            case 10:
                System.out.println("O principal evento de Outubro e: ");
                System.out.println("12/10 - Dia de Nossa Senhora Aparecida (Padroeira do Brasil)");
                System.out.println("12/10 - Dia das Criancas");
                break;
                
            case 11:
                System.out.println("O principal evento de Novembro e: ");
                System.out.println("02/11 – Finados");
                System.out.println("15/11 – Proclamação da República");
                System.out.println("20/11 – Dia da Consciência Negra (feriado em alguns estados e municípios)");
                break;
                
            case 12:
                System.out.println("O principal evento de Dezembro e: ");
                System.out.println("25/12 – Natal");
                System.out.println("31/12 – Véspera de Ano Novo (Réveillon)");
                break; 
                
            default:
                System.out.println ("ERRO");
        }
    }
}
