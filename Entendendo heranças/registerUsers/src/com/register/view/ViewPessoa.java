package com.register.view;

import com.register.model.Estudante;
import com.register.model.Professor;

public class ViewPessoa {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Gabrielle", 23991291, "Sistemas para Internet", 123456);
        Professor p1 = new Professor("Edilson", 134829384, "Tecnologia da Informação", 2010);

        System.out.println("\n------- Cadastros -------\n");
        System.out.println(e1.exibirInfo() + "\n");
        System.out.println("-------------------------");
        System.out.println(p1.exibirInfo() + "\n");
        System.out.println("-------------------------\n");


        System.out.println("O estudante "+ e1.getNome()+" está cadastrado no curso "+e1.getCurso());
        System.out.println("O professor "+ p1.getNome()+" foi contratado no ano "+p1.getAno());
        
    }
}
