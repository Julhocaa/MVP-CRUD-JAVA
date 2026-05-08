package Logica;

import java.util.*;
public class Calculadora {


    public int opcao;


    public static void Calcular(int opcao) {
        Scanner insercaoDados = new Scanner(System.in);

        opcao = opcao;

        do {

            System.out.println("Bem vindo a calculadora Julio, abaixo temos algumas escolhas de operações");

            System.out.println("1-Você quer somar?");
            System.out.println("2-Você quer Subtrair?");
            System.out.println("3-Você quer Multiplicar?");
            System.out.println("4-Você quer Dividir?");


            opcao = insercaoDados.nextInt();

            if (opcao > 5 || opcao == 0) {
                System.out.println("desculpe.. tente novamente");


            } else {
                System.out.println("Digite 2 valores para fazer sua operação: ");

                break;
            }

        }

        while (opcao != 0 || opcao < 5);

        double resultado = 0;
        double numeroUm = insercaoDados.nextDouble();
        double numeroDois = insercaoDados.nextDouble();


        switch (opcao) {
            case 1:
                resultado = numeroUm + numeroDois;
                break;
            case 2:
                resultado = numeroUm - numeroDois;
                break;
            case 3:
                resultado = numeroUm * numeroDois;
                break;
            case 4:
                resultado = numeroUm / numeroDois;
                break;

            default:
                System.out.println("Cedencias erradas");


        }

        System.out.println("Resultado foi: " + resultado);

    }
}






