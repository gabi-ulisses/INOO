package com.ibag.empresa.view;

import java.util.ArrayList;

import com.ibag.empresa.model.Administrativo;
import com.ibag.empresa.model.Funcionario;
import com.ibag.empresa.model.Gerente;
import com.ibag.empresa.model.Programador;
import com.ibag.empresa.model.Secretario;
import com.ibag.empresa.model.Tecnico;

public class Console{
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Gerente g = new Gerente("Edilson",5000);
        funcionarios.add(g);

        Programador p = new Programador("Gabrielle",2000);
        funcionarios.add(p);

        Secretario s = new Secretario("Maria",2000);
        funcionarios.add(s);

        Tecnico t = new Tecnico(001,"Paulo", 3000);
        funcionarios.add(t);

        Administrativo a = new Administrativo(002, "Julia", "Diurno", 2000);
        funcionarios.add(a);

        for (Funcionario f : funcionarios) {
            System.out.println("\nFuncionaŕio:" + f.getNome() + 
                                "\nCargo: " + f.getCargo() +
                                "\nSalário: R$"+ f.getSalario() +
                                "\nBônus: R$"+f.calcularBonus()
            );
        }
    }
}