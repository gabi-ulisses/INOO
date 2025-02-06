package com.ibag.ass.model;

import java.time.LocalDate;

public class AssinaturaAnual extends Assinatura {
    private double valorAnual;
    private boolean cancelada;

    public AssinaturaAnual(String nomeAssinante, String descricaoProduto, LocalDate dataInicio, double valorAnual) {
        super(nomeAssinante, descricaoProduto, dataInicio, 12);
        this.valorAnual = valorAnual;
        this.cancelada = false;
    }

    @Override
    public void renovarAssinatura() {
        if (!cancelada) {
            System.out.println("Assinatura anual renovada automaticamente.");
        }
    }

    @Override
    public void cancelarAssinatura() {
        this.cancelada = true;
        System.out.println("Assinatura anual cancelada. Multa de 30% aplicada.");
    }

    @Override
    public double calcularTotalPago() {
        LocalDate hoje = LocalDate.now();
        // Calcula a diferença em anos entre hoje e a data de início
        int anosDiferenca = hoje.getYear() - dataInicio.getYear();
        
        // Ajusta a diferença caso a data atual ainda não tenha alcançado o "aniversário" da data de início neste ano
        LocalDate aniversario = dataInicio.plusYears(anosDiferenca);
        if (hoje.isBefore(aniversario)) {
            anosDiferenca--;
        }
        
        double total = anosDiferenca * valorAnual;
        if (cancelada) {
            total += total * 0.30; // aplica multa de 30% se cancelada
        }
        return total;
    }

    @Override
    public String detalhesAssinatura() {
        return "Assinatura Anual: " + descricaoProduto 
                + " - Assinante: " + nomeAssinante 
                + ", Valor anual (com desconto): " + valorAnual;
    }
}