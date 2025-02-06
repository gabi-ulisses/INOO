package com.ibag.ass.model;

import java.time.LocalDate;
import java.time.Period;

public abstract class Assinatura implements Renovavel {
    protected String nomeAssinante;
    protected String descricaoProduto;
    protected LocalDate dataInicio;
    protected int frequenciaCobranca; // em meses (1 para mensal, 12 para anual)

    public Assinatura(String nomeAssinante, String descricaoProduto, LocalDate dataInicio, int frequenciaCobranca) {
        this.nomeAssinante = nomeAssinante;
        this.descricaoProduto = descricaoProduto;
        this.dataInicio = dataInicio;
        this.frequenciaCobranca = frequenciaCobranca;
    }

    public abstract double calcularTotalPago();

    public abstract String detalhesAssinatura();
}

