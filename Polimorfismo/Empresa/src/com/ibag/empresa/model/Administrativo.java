package com.ibag.empresa.model;

public class Administrativo extends Assistente{
    private String turno;

    public Administrativo(int codigo, String nome, String turno, double salario){
        super(codigo, nome, salario);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    @Override
    public String getCargo(){
        return "Administrativo";
    }
}
