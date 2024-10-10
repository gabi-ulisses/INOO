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
        int count = 0;

        while (city1 < city2) {
            city1 += city1 * 0.03;
            city2 += city2 * 0.02; // crescimento de 2% ao ano
            
            count++;
        }
        

        System.out.println("São necessários "+ count +" anos para que a cidade 1 ultrapasse a cidade 2.");

    }
}
