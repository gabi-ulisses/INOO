package com.statics.model;

public class Endereco{
    private String rua;
    private String cep;
    private String bairro;
    
    public Endereco(){}

    public Endereco(String rua){
        this.rua = rua;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }

    public String getRua(){
        return rua;
    }
}
