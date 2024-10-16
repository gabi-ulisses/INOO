/*
 * Programa que lê o preço de um produto, calcula e mostra o novo preço e a classificação de acordo com as tabelas fornecidas.
 * 
 *  |         Preço           |        Aumento      |  
 *  |      Até R$ 50,00       |        10%          |                  
 *  |  R$ 50,00 -  R$ 100,00  |        20%          |                 
 *  |   Acima de R$ 100,00    |        30%          |                
 *                                                 
 *  |        Novo Preço       |   Classificação  |
 *  |     Até R$ 80,00        |    Barato        |
 *  |  R$ 80,00 - R$ 120,00   |    Normal        |
 *  |  R$ 120,00 - R$ 200,00  |    Caro          |
 *  |  Acima de R$ 200,00     |    Muito Caro    |
 */
package aula2.exercicios;

import java.util.Scanner;

public class ReadingPrice {

    public static void main(String[] args){

        double preco, novopreco = 0, aumento;
        String classificacao;

        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o preço do produto: R$");
        preco = ler.nextInt();

        if (preco <= 50) {
            aumento = preco * 0.1;
        }else if(preco > 50 && preco <= 100){
            aumento = preco * 0.2;
        }else{
            aumento = preco * 0.3;
        }

        novopreco = preco + aumento;

        if (novopreco <= 80){
            classificacao = "Barato";
        }else if(novopreco > 80 && novopreco <= 120){
            classificacao = "Normal";

        }else if(novopreco > 120 && novopreco <= 200){
            classificacao = "Caro";

        }else{
            classificacao = "Muito Caro";
        }

        System.out.printf("Aumento de: R$%6.2f\n", aumento);
        System.out.printf("Novo preço: R$%6.2f\n",novopreco);
        System.out.println("Classificação: "+classificacao);

        ler.close();
    }
    
}
