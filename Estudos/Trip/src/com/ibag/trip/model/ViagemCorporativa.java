package com.ibag.trip.model;

import java.time.LocalDate;

public abstract class ViagemCorporativa {

    private int id;
    private String destino;
    private LocalDate dataIda;
    private LocalDate dataVolta;
    protected final double TAXA = 5.0;

    
    public ViagemCorporativa(int id, String destino, LocalDate dataIda, LocalDate dataVolta) {
        this.id = id;
        this.destino = destino;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
    }

    public int getId(){
        return id;
    }
    
    public String getDestino() {
        return destino;
    }

    public LocalDate getDataIda() {
        return dataIda;
    }

    public LocalDate getDataVolta() {
        return dataVolta;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDataIda(LocalDate dataIda) {
        this.dataIda = dataIda;
    }

    public void setDataVolta(LocalDate dataVolta) {
        this.dataVolta = dataVolta;
    }

    public abstract void detalhesViagem();
}