package Estudos.Viagens;

import java.time.LocalDate;

public class ViagemNacional extends ViagemCorporativa {
    private String documentoIdentificacao;
    private static final double TAXA_REMARCACAO = 50.0;

    public ViagemNacional(String destino, LocalDate dataIda, LocalDate dataVolta, String documentoIdentificacao) {
        super(destino, dataIda, dataVolta);
        this.documentoIdentificacao = documentoIdentificacao;
    }

    public String getDocumentoIdentificacao() {
        return documentoIdentificacao;
    }

    public void setDocumentoIdentificacao(String documentoIdentificacao) {
        this.documentoIdentificacao = documentoIdentificacao;
    }

    @Override
    public void detalhesViagem() {
        System.out.println("Viagem Nacional para " + getDestino() + " com ida em " + getDataIda() + " e volta em " + getDataVolta());
    }

    public boolean remarcarViagem(LocalDate novaDataIda, LocalDate novaDataVolta, String novoDestino) {
        LocalDate hoje = LocalDate.now();
        if (hoje.isBefore(getDataIda().minusDays(2))) {
            setDataIda(novaDataIda);
            setDataVolta(novaDataVolta);
            setDestino(novoDestino);
            System.out.println("Viagem remarcada com sucesso. Taxa de remarcação: R$" + TAXA_REMARCACAO);
            return true;
        } else {
            System.out.println("Não é possível remarcar a viagem com menos de 2 dias de antecedência.");
            return false;
        }
    }
}