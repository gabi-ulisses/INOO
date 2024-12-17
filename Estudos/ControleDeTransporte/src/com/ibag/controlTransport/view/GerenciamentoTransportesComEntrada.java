package com.ibag.controlTransport.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ibag.controlTransport.model.Aviao;
import com.ibag.controlTransport.model.Barco;
import com.ibag.controlTransport.model.Caminhao;
import com.ibag.controlTransport.model.Carga;
import com.ibag.controlTransport.model.Transporte;

public class GerenciamentoTransportesComEntrada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Transporte> transportes = new ArrayList<>();

        while (true) {
            System.out.print("\nEscolha o tipo de transporte (1- Avião, 2- Caminhão, 3- Barco, 0- Finalizar): ");
            int tipo = ler.nextInt();

            if (tipo == 0) {
                break; 
            }

            System.out.print("\nInforme a capacidade da carga (kg): ");
            double pesoCarga = ler.nextDouble();
            Carga carga = new Carga(pesoCarga);

            System.out.print("\nInforme a quantidade de dias para entrega: ");
            int diasEntrega = ler.nextInt();

            Transporte transporte = null;

            switch (tipo) {
                case 1:
                    System.out.print("\nInforme a autonomia (km): ");
                    double autonomia = ler.nextDouble();

                    transporte = new Aviao(carga, diasEntrega, autonomia);
                    break;
                case 2:
                    System.out.print("\nInforme o número de eixos: ");
                    int numeroEixos = ler.nextInt();
                    ler.nextLine();

                    System.out.print("\nInforme a placa: ");
                    String placa = ler.nextLine();

                    System.out.print("\nInforme a cor: ");
                    String cor = ler.nextLine();

                    transporte = new Caminhao(carga, diasEntrega, numeroEixos, placa, cor);
                    break;
                case 3:
                    System.out.print("\nInforme o comprimento (m): ");
                    double comprimento = ler.nextDouble();

                    System.out.print("\nInforme a largura (m): ");
                    double largura = ler.nextDouble();
                    ler.nextLine();

                    System.out.print("\nInforme a bandeira: ");
                    String bandeira = ler.nextLine();

                    System.out.print("\nInforme o número de tripulantes: ");
                    int numeroTripulantes = ler.nextInt();

                    transporte = new Barco(carga, diasEntrega, comprimento, largura, bandeira, numeroTripulantes);
                    break;
                default:
                    System.out.println("Tipo de transporte inválido.");
                    continue; 
            }

            transportes.add(transporte);
            System.out.println("\nTransporte cadastrado com sucesso!");
        }

        System.out.println("\n------------------------------------------ Relatório Final de Transportes ------------------------------------------\n");
        for (Transporte t : transportes) {
            System.out.println(t.toString());
            System.out.println("\n---------------------------------------------------------------------------------------------------------------------");
        }

        ler.close();
    }
}