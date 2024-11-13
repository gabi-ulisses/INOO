package com.forAddress.model;

public class Endereco {

    private String logradouro;
    private int numero;
    private String complemento;
    private int cep;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, int numero, String complemento, int cep, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String listarEndereco() {
        return logradouro + ", " + numero + (complemento.isEmpty() ? "" : ", " + complemento) + ", " +
               cidade + " - " + estado + ", CEP: " + cep;
    }
}
