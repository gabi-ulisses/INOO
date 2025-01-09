package com.ibag.empresa.model;

public class Assistente extends Funcionario{
    private int codigo;

    public Assistente(int codigo, String nome, double salario){
        super(nome, salario);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
