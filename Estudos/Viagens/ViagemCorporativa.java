package Estudos.Viagens;

import java.time.LocalDate;

public abstract class ViagemCorporativa {
    private String destino;
    private LocalDate dataIda;
    private LocalDate dataVolta;

    public ViagemCorporativa(String destino, LocalDate dataIda, LocalDate dataVolta) {
        this.destino = destino;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
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