/*
 *  Programa que gerencia um estacionamento rotativo de carros. 
 *  O programa deve armazenar a descrição do carro, a placa, o horário de ler e o horário de saída (despreze os minutos). 
 *  O estacionamento cobra X reais pela primeira hora de permanência com o automóvel e X/3 pelas demais horas. Além disso, é fornecido um desconto para o pagamento de acordo com a tabela abaixo:
 *   
 *  |               Valor               |    Desconto (%)   |
 *  |  Até R$ 20 (inclusive)            |        5          |
 *  |  Entre R$ 20 e R$ 50 (inclusive)  |        10         |
 *  |  Acima de R$ 50                   |        20         |
 * 
 * 
 *  O programa deve exibir um relatório contendo as seguintes informações:
 * 
 *      a) Tipo do carro.
 *      b) Placa.
 *      c) Hora da ler.
 *      d) Hora da Saída.
 *      e) Valor Pago
 * 
 */

package com.conditionalStructures.view;

import java.util.Scanner;

import com.conditionalStructures.model.Parking;

public class ViewParking {

    public static void main(String[] args){

        Parking p = new Parking();
    
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o tipo do carro: ");
        p.setTipo(ler.nextLine());

        System.out.print("Informe a placa do carro: ");
        p.setPlaca(ler.nextInt());

        System.out.print("Informe o horário de entrada: ");
        p.setHoraEntrada(ler.nextInt());

        System.out.print("Informe o horário de saída: ");
        p.setHoraSaida(ler.nextInt());

        System.out.print("Informe o valor da hora de permanência: R$");
        p.setValorHora(ler.nextDouble());

        System.out.println("\nTipo do carro: "+p.getTipo());
        System.out.println("Placa: "+p.getPlaca());
        System.out.println("Hora de entrada: "+p.getHoraEntrada()+"h");
        System.out.println("Hora de saída: "+p.getHoraSaida()+"h");
        System.out.printf("Valor pago: R$%6.2f", p.calculaValorFinal(p.getValorHora, p.calculaHoras(p.getHoraEntrada(), p.getHoraSaida())));

        ler.close();
    }
}
