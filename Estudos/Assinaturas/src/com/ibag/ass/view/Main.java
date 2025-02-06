package com.ibag.ass.view;

import com.ibag.ass.model.Assinatura;
import com.ibag.ass.model.AssinaturaMensal;
import com.ibag.ass.model.AssinaturaAnual;

import java.time.LocalDate;

public class Main {

     public static void main(String[] args) {
        Assinatura mensal = new AssinaturaMensal("João", "Serviço de Streaming", LocalDate.of(2023, 1, 1), 29.90);
        Assinatura anual = new AssinaturaAnual("Maria", "Serviço de Edição de Fotos", LocalDate.of(2022, 1, 1), 299.90);

        System.out.println(mensal.detalhesAssinatura());
        System.out.println("Total pago até o momento: " + mensal.calcularTotalPago());

        System.out.println(anual.detalhesAssinatura());
        System.out.println("Total pago até o momento: " + anual.calcularTotalPago());

        // Cancelamento das assinaturas
        mensal.cancelarAssinatura();
        anual.cancelarAssinatura();
    }
}
