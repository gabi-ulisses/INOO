package com.register.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.register.model.Estudante;

public class ViewEstudante {
    public static void main(String[] args) {
    
        Estudante e1 = new Estudante("Gabi", 20, 123456);
        Estudante e2 = new Estudante("Ana", 20, 123456);
        Estudante e3 = new Estudante("Edu", 20, 123456);

        ArrayList<Estudante> estudantes = new ArrayList<>();
        
        estudantes.add(e1);
        estudantes.add(e2);

        for (Estudante e : estudantes){
            System.out.println("Nome: " + e.getNome() + "- Idade: " + e.getIdade() + " - Prontuario: " + e.getProntuario());
        }

    }
}
