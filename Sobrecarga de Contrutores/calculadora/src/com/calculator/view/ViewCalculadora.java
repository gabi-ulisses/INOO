package com.calculator.view;

import java.util.Scanner;

import com.calculator.model.Calculadora;

public class ViewCalculadora {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Calculadora c = new Calculadora();

        int opcao = 0;

        System.out.println("------- Calculadora --------");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Operação desejada: ");
        opcao = ler.nextInt();

        if(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4){
            System.out.print("Digite o primeiro número: ");
            c.setN1(ler.nextDouble());
            System.out.print("Digite o segundo número: ");
            c.setN2(ler.nextDouble());
            
            switch (opcao) {
                case 1:
                    System.out.println(c.getN1()+" + "+c.getN2()+" = "+c.somar(c.getN1(), c.getN2()));  
                    break;
                case 2:
                    System.out.println(c.getN1()+" - "+c.getN2()+" = "+c.subtrair(c.getN1(), c.getN2()));  
                    break;
                case 3:
                    
                    System.out.println(c.getN1()+" * "+c.getN2()+" = "+c.multiplicar(c.getN1(), c.getN2()));  
                    break;
                case 4:
                    System.out.println(c.getN1()+" / "+c.getN2()+" = "+c.dividir(c.getN1(), c.getN2()));  
                    break;

                default:
                    System.out.println("Opção inválida!");
                break;
            }
        }else{
            System.out.println("Opção inválida!");
        }

        ler.close();
    }
}
