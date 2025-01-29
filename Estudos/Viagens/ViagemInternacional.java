package Estudos.Viagens;

import java.time.LocalDate;

public class ViagemInternacional extends ViagemCorporativa {
    private String numeroPassaporte;
    private static final double TAXA_REMARCACAO = 150.0;

    public ViagemInternacional(String destino, LocalDate dataIda, LocalDate dataVolta, String numeroPassaporte) {
        super(destino, dataIda, dataVolta);
        this.numeroPassaporte = numeroPassaporte;
    }

    public String getNumeroPassaporte() {
        return numeroPassaporte;
    }

    public void setNumeroPassaporte(String numeroPassaporte) {
        this.numeroPassaporte = numeroPassaporte;
    }

    @Override
    public void detalhesViagem() {
        System.out.println("Viagem Internacional para " + getDestino() + " com ida em " + getDataIda() + " e volta em " + getDataVolta());
    }

    public boolean remarcarViagem(LocalDate novaDataIda) {
        LocalDate hoje = LocalDate.now();
        if (hoje.isBefore(getDataIda().minusDays(7))) {
            setDataIda(novaDataIda);
            System.out.println("Viagem remarcada com sucesso. Taxa de remarcação: R$" + TAXA_REMARCACAO);
            return true;
        } else {
            System.out.println("Não é possível remarcar a viagem com menos de 7 dias de antecedência.");
            return false;
        }
    }
}