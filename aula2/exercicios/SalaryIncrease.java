/*
 *   Programa que lê o salário de um funcionário, calcule e mostre o novo salário e o aumento baseando-se na tabela a seguir:
 * 
 *  |         Salário         |   % de Aumento     |  
 *  |      Até R$1500,00      |        20%         |                  
 *  |  Acima de  R$1500,00    |        10%         |                 
 *                                                   
 */

package aula2.exercicios;

import java.util.Scanner;

public class SalaryIncrease {
    
    public static void main(String[] args){

        double salario, aumento;

        Scanner ler = new Scanner(System.in);

        System.out.print("Informe seu salário atual: R$");
        salario = ler.nextInt();
        
        if (salario <= 1500) {
            aumento = salario * 0.20;
            salario += aumento;
            System.out.printf("Parabéns! Você teve um aumento de R$%6.2f. Seu novo salário é de %6.2f\n", aumento, salario);
        }else{
            aumento = salario * 0.10;
            salario += aumento;
            System.out.printf("Parabéns! Você teve um aumento de R$%6.2f!\n Seu novo salário é de %6.2f!\n", aumento, salario);
        }

        ler.close();
        
    }

}
