package com.ibag.trip.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.ibag.trip.model.ViagemInternacional;
import com.ibag.trip.model.ViagemNacional;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<ViagemNacional> viagensNacionais = new ArrayList<>();
        List<ViagemInternacional> viagensInternacionais = new ArrayList<>();

        ViagemNacional vN1 = new ViagemNacional(101,"Bahia", LocalDate.parse("31/01/2025", formato), LocalDate.parse("31/02/2025", formato), 123456788, 123456700);
        ViagemNacional vN2 = new ViagemNacional(202,"Rio de Janeiro", LocalDate.parse("04/02/2025", formato), LocalDate.parse("04/03/2025", formato), 123456788, 123456700);

        viagensNacionais.add(vN1);
        viagensNacionais.add(vN2);


        ViagemInternacional vI1 = new ViagemInternacional(303, "Salvador", LocalDate.parse("02/02/2025", formato), LocalDate.parse("29/02/2025", formato), 63568);
        ViagemInternacional vI2 = new ViagemInternacional(404, "São Paulo", LocalDate.parse("15/02/2025", formato), LocalDate.parse("15/03/2025", formato), 63568);

        viagensInternacionais.add(vI1);
        viagensInternacionais.add(vI2);


        System.out.println("\nViagens nacionais agendadas: \n");
        for (ViagemNacional vN : viagensNacionais) {
            vN.detalhesViagem();
        }

        System.out.println("\nViagens internacionais agendadas: \n");
        for (ViagemInternacional vI : viagensInternacionais) {
            vI.detalhesViagem();
        }

        vN1.remarcarViagem(LocalDate.parse("01/02/2025", formato), LocalDate.parse("29/02/2025", formato), "Pernambuco");
        vN2.remarcarViagem(LocalDate.parse("06/02/2025", formato), LocalDate.parse("06/03/2025", formato), "Campinas");

        System.out.println("\nViagens nacionais após remarcação:");
        for (ViagemNacional vN : viagensNacionais) {
            vN.detalhesViagem();
        }

        vI1.remarcarViagem(LocalDate.parse("04/02/2025", formato), LocalDate.parse("29/02/2025", formato), "Curitiba");
        vI2.remarcarViagem(LocalDate.parse("17/02/2025", formato), LocalDate.parse("17/03/2025", formato), "Pará");

        System.out.println("\nViagens internacionais após remarcação:");
        for (ViagemNacional vN : viagensNacionais) {
            vN.detalhesViagem();
        }
    }
}
