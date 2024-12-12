package com.ibag.controlTransport.view;

import java.util.Scanner;

import com.ibag.controlTransport.model.Aviao;
import com.ibag.controlTransport.model.Barco;
import com.ibag.controlTransport.model.Caminhao;
import com.ibag.controlTransport.model.Carga;
import com.ibag.controlTransport.model.Transporte;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de transporte (1- Avião, 2- Caminhão, 3- Barco): ");
        int tipo = scanner.nextInt();

        System.out.println("Informe o peso da carga (kg): ");
        double pesoCarga = scanner.nextDouble();
        Carga carga = new Carga(pesoCarga);

        System.out.println("Informe a quantidade de dias para entrega: ");
        int diasEntrega = scanner.nextInt();

        Transporte transporte = null;

        switch (tipo) {
        case 1:
        System.out.println("Informe a autonomia (km): ");
        double autonomia = scanner.nextDouble();
        transporte = new Aviao(carga, diasEntrega, autonomia);
        break;
        case 2:
        System.out.println("Informe o número de eixos: ");
        int numeroEixos = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        System.out.println("Informe a placa: ");
        String placa = scanner.nextLine();
        System.out.println("Informe a cor: ");
        String cor = scanner.nextLine();
        transporte = new Caminhao(carga, diasEntrega, numeroEixos, placa, cor);
        break;
        case 3:
        System.out.println("Informe o comprimento (m): ");
        double comprimento = scanner.nextDouble();
        System.out.println("Informe a largura (m): ");
        double largura = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha
        System.out.println("Informe a bandeira: ");
        String bandeira = scanner.nextLine();
        System.out.println("Informe o número de tripulantes: ");
        int numeroTripulantes = scanner.nextInt();
        transporte = new Barco(carga, diasEntrega, comprimento, largura, bandeira, numeroTripulantes);
        break;
        default:
        System.out.println("Tipo de transporte inválido.");
        System.exit(0);
        }

        System.out.println(transporte.toString());
        scanner.close();
        }
}
