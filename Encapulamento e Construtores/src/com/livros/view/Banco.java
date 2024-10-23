package com.livros.view;

import java.util.Scanner;

import com.livros.model.ContaBancaria;

public class Banco {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria("1234566", 0.0);

        int opcao = -1;
        double valor;

        while (opcao != 0) {

            System.out.println("Opções: ");
            System.out.println("1 - Verificar saldo atual: ");
            System.out.println("2 - Depositar ");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Opção desejada: ");
            opcao = ler.nextInt();
            double saldo;

            switch (opcao) {

                case 1:
                    saldo = conta.getSaldo();
                    System.out.println("Valor do saldo atual: R$"+saldo);
                break;

                case 2:
                    System.out.print("Valor do depósito: R$");
                    valor = ler.nextDouble();
                    saldo = conta.getSaldo();
                    conta.depositar(valor, saldo);
                break;

                case 3:
                    System.out.print("Valor do saque: R$");
                    valor = ler.nextDouble();
                    saldo = conta.getSaldo();
                    conta.sacar(valor, saldo);
                break;

                case 0:
                    System.out.println("Saindo...");
                break;

                default:
                    System.out.println("Opção inválida!");
                break;
            }
        }

        ler.close();

    }
    
}
