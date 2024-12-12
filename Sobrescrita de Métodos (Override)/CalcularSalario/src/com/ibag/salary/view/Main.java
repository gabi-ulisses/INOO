package com.ibag.salary.view;

import com.ibag.salary.model.Funcionario;
import com.ibag.salary.model.Gerente;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(2500);
        System.out.println("Bônus: R$ " + f1.calcularBonus());

        Gerente  g1 = new Gerente(8000);
        System.out.println("Bônus: R$ " + g1.calcularBonus());
    }
}
