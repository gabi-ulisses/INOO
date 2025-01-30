package com.ibag.trip.model;

import java.time.LocalDate;

public interface Remarcavel {

    public  boolean remarcarViagem(LocalDate novaDataIda, LocalDate novaDataVolta, String novoDestino);
}
