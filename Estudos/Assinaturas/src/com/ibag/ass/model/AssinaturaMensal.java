package com.ibag.ass.model;

import java.time.LocalDate;

public class AssinaturaMensal extends Assinatura {
    private double valorMensal;
    private boolean cancelada;

    public AssinaturaMensal(String nomeAssinante, String descricaoProduto, LocalDate dataInicio, double valorMensal) {
        super(nomeAssinante, descricaoProduto, dataInicio, 1);
        this.valorMensal = valorMensal;
        this.cancelada = false;
    }

    @Override
    public void renovarAssinatura() {
        if (!cancelada) {
            System.out.println("Assinatura mensal renovada automaticamente.");
        }
    }

    @Override
    public void cancelarAssinatura() {
        this.cancelada = true;
        System.out.println("Assinatura mensal cancelada sem multa.");
    }

    @Override
    public double calcularTotalPago() {
        LocalDate hoje = LocalDate.now();
        int anosDiferenca = hoje.getYear() - dataInicio.getYear();
        int mesesDiferenca = hoje.getMonthValue() - dataInicio.getMonthValue();
        int totalMeses = anosDiferenca * 12 + mesesDiferenca;
        return totalMeses * valorMensal;
    }


    @Override
    public String detalhesAssinatura() {
        return "Assinatura Mensal: " + descricaoProduto + " - Assinante: " + nomeAssinante + ", Valor mensal: " + valorMensal;
    }
}

