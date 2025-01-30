package com.ibag.trip.model;

import java.time.LocalDate;

public class ViagemInternacional extends ViagemCorporativa implements Remarcavel{

        private int nPass;
    
        public ViagemInternacional(int id, String destino, LocalDate dataIda, LocalDate dataVolta, int nPass) {
            super(id, destino, dataIda, dataVolta);
            this.nPass = nPass;
        }
    
        public int getnPass() {
            return nPass;
        }
    
        public void setnPass(int nPass) {
            this.nPass = nPass;
        }
    
        @Override
        public void detalhesViagem() {
            System.out.println("\nViagem " + getId() + 
                                "\nDestino: " + getDestino() + 
                                "\nIda: " + getDataIda() + " | Volta: " + getDataVolta() +
                                "\nPassaporte: "+ getnPass() + "\n");
        }
    
        @Override
        public boolean remarcarViagem(LocalDate novaDataIda, LocalDate novaDataVolta, String novoDestino) {
            LocalDate hoje = LocalDate.now();
    
            if (hoje.isBefore(getDataIda().minusDays(7))) {
                setDataIda(novaDataIda);
                setDataVolta(novaDataVolta);
                setDestino(novoDestino);
                System.out.println("Viagem remarcada com sucesso. Taxa de remarcação: R$" + TAXA);
            return true;
        } else {
            System.out.println("Não é possível remarcar a viagem com menos de 2 dias de antecedência.");
            return false;
        }
    }
}





