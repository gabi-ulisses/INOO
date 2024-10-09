/*
 * Programa que lê o código de um produto e verifica sua validade de acordo com a tabela abaixo. 
 * 
 * CÓDIGO  |  PRODUTO  |  VALOR
 *   1     |   café    |  R$5,00
 *   2     | cappucino |  R$9,50
 *   3     | chocolate |  R$10,20
 * 
 * Caso a opção seja válida (ou seja, exibida na tabela), o valor do produto deve ser impresso. Caso contrário, uma mensagem informando que o produto não está cadastrado deve ser exibida.
 */

package aula2.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

class Produtos{
    int[] codigo = {1, 2, 4};
    String[] nome = {"café", "cappucino", "chocolate"};
    double[] valor = {5.00, 9.50, 10.20};;
}

public class ProductSearch {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Produtos p = new Produtos();

        System.out.print("Digite o código do produto: ");
        int codigo = ler.nextInt();

        for(int i = 0; i < 3; i++){
            if (codigo == p.codigo[i]){
                System.out.println("Produto: " + p.nome[i]);
                System.out.printf("Valor: R$%6.2f\n", p.valor[i]);
            }else{
                System.out.println("Produto não está cadastrado.");
            }
            
        }

        ler.close();
    }
}

