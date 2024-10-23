package com.gabrielle.academico.view;

import com.gabrielle.academico.model.Aluno;

public class TesteAluno {
    public static void main(String[] args){
        Aluno a1 = new Aluno(); // Criando uma nova instância/objeto

        a1.setNome("Gabrielle");
        
        a1.setIdade(20);

        System.out.println("\nNome do aluno: "+a1.getNome());
        System.out.println("Idade do aluno: "+a1.getIdade()+" anos");
    }
}
