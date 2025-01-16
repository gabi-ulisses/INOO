package com.ibag.school.view;

import java.util.Scanner;

import com.ibag.school.model.Estudante;
import com.ibag.school.model.Pessoa;
import com.ibag.school.model.Professor;

public class Console {
    public static void main(String[] args) {
        Pessoa p = new Professor("Edilson", "edilson@ifsp.edu.br", "1234", "JAdKJcASL");
        Pessoa e = new Estudante("Gabrielle", "gabrielle@aluno.ifsp.edu.br", "1234", "AQ3030512");


        p.acessarSistema();
        e.acessarSistema();
    }
}
