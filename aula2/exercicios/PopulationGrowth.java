/*
 * 
 * Programa que calcula o crescimento populacional de um cidade até que ultrapasse o
 * número de habitantes de outra cidade.
 * 
 */
package aula2.exercicios;

public class PopulationGrowth {
    public static void main(String[] args){

        double city1 = 250000;
        double city2 = 265000;
        double aumento;
        int i, count = 0;

        for(i = 0; city1 < city2; i++){
                aumento = city1 * 0.3;
                city1 += aumento;

                count++;
        }

        System.out.println("São necessários "+ i +" anos.");

    }
}
