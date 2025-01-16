package com.ibag.work.view;

import com.ibag.work.model.Gerente;
import com.ibag.work.model.Programador;

public class Console {
    public static void main(String[] args) {
        // Funcionario f = new Funcionario("Antonio", 4000);
        // a classe é abstrata. Não pode ser instanciada!
        Gerente g1 = new Gerente("José", 8000);
        Programador p1 = new Programador("Paloma", 5000);
        
        System.out.println("Nome: " + g1.getNome() + ", Novo salário: " +
                g1.calcularAumentoSalario());
        System.out.println("Nome: " + p1.getNome() + ", Novo salário: " +
                p1.calcularAumentoSalario());
    }
}