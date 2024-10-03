/*
 *  Programa que gerencia um estacionamento rotativo de carros. 
 *  O programa deve armazenar a descrição do carro, a placa, o horário de entrada e o horário de saída (despreze os minutos). 
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
 *      c) Hora da Entrada.
 *      d) Hora da Saída.
 *      e) Valor Pago
 * 
 */

package aula1.exercicios;

import java.util.Scanner;

public class Parking {

    public static void main(String[] args){
    
        Scanner entrada = new Scanner(System.in);

        String tipoCarro;
        int placa, horaEntrada, horaSaida, horasTotal;
        double valorHora, valorFinal;


        System.out.print("Informe o tipo do carro: ");
        tipoCarro = entrada.nextLine();
        System.out.print("Informe a placa do carro: ");
        placa = entrada.nextInt();
        System.out.print("Informe o horário de entrada: ");
        horaEntrada = entrada.nextInt();
        System.out.print("Informe o horário de saída: ");
        horaSaida = entrada.nextInt();
        System.out.print("Informe o valor da hora de permanência: R$");
        valorHora = entrada.nextInt();

        horasTotal = horaSaida - horaEntrada;
        
        valorFinal = valorHora + ((horasTotal - 1)*(valorHora/3));

        if (valorFinal <= 20){
            valorFinal -= (valorFinal * 0.05); // Desconto de 5%
        }else if((valorFinal > 20) && (valorFinal <= 50)){
            valorFinal -= (valorFinal * 0.10); // Desconto de 10%
        }else{
            valorFinal -= (valorFinal * 0.20); // Desconto de 20%
        }

        System.out.println("\nTipo do carro: "+tipoCarro);
        System.out.println("Placa: "+placa);
        System.out.println("Hora de entrada: "+horaEntrada+"h");
        System.out.println("Hora de saída: "+horaSaida+"h");
        System.out.printf("Valor pago: R$%.2f", valorFinal);

    }
}
