package aula1.exercicios;

import java.util.Scanner;

public class PointedAverage {
    
    public static void main(String[] arg){

        int nota1, nota2;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        nota1 = entrada.nextInt();
        
        System.out.print("Informe a segunda nota: ");
        nota2 = entrada.nextInt();

        double media = ((nota1 * 1)+(nota2 * 2))/(1 + 2);
        
        System.out.println("Média: "+media);
    }
}
