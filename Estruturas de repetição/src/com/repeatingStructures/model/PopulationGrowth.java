package com.repeatingStructures.model;

public class PopulationGrowth {

        public int count = 0;

        public int analyze(double city1, double city2){
            while (city1 < city2) {
                city1 += city1 * 0.03;
                city2 += city2 * 0.02; // crescimento de 2% ao ano
                
                count++;
            }
            return count;
        }
    }
