package com.ibag.trip.model;

import java.time.LocalDate;

public class ViagemNacional extends ViagemCorporativa implements Remarcavel{
    private int RG;
    private int CPF;

    public ViagemNacional(int id, String destino, LocalDate dataIda, LocalDate dataVolta, int RG, int CPF){
        super(id, destino, dataIda, dataVolta);
        this.RG = RG;
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }
    public void setRG(int rG) {
        RG = rG;
    }
    public int getCPF() {
        return CPF;
    }
    public void setCPF(int cPF) {
        CPF = cPF;
    }


    @Override
    public void detalhesViagem() {
        System.out.println("\nViagem " + getId() + 
                            "\nDestino: " + getDestino() + 
                            "\nIda: " + getDataIda() + " | Volta: " + getDataVolta() +
                            "\nRG: " + getRG() + " | CPF: " + getCPF() + "\n");
    }

    @Override
    public boolean remarcarViagem(LocalDate novaDataIda, LocalDate novaDataVolta, String novoDestino){
        LocalDate hoje = LocalDate.now();
        if (hoje.isBefore(getDataIda().minusDays(2))) {
            setDataIda(novaDataIda);
            setDataVolta(novaDataVolta);
            setDestino(novoDestino);
            System.out.println("Viagem "+ getId() +" remarcada com sucesso. Taxa de remarcação: R$" + TAXA);
            return true;
        } else {
            System.out.println("Não é possível remarcar a viagem "+ getId() +" com menos de 2 dias de antecedência.");
            return false;
        }
    }
}
