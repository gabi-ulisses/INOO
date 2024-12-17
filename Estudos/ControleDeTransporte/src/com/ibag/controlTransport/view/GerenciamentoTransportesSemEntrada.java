package com.ibag.controlTransport.view;

import java.util.ArrayList;
import java.util.List;

import com.ibag.controlTransport.model.Aviao;
import com.ibag.controlTransport.model.Barco;
import com.ibag.controlTransport.model.Caminhao;
import com.ibag.controlTransport.model.Carga;
import com.ibag.controlTransport.model.Transporte;

public class GerenciamentoTransportesSemEntrada {
    public static void main(String[] args) {

        List<Transporte> transportes = new ArrayList<>();

        Carga cargaAviacao = new Carga(10);
        Carga cargaCaminhao = new Carga(15);
        Carga cargaBarco = new Carga(20);

        transportes.add(new Aviao(cargaAviacao, 9, 1500.0)); 
        transportes.add(new Caminhao(cargaCaminhao, 30, 6, "ABC1234", "Vermelho")); 
        transportes.add(new Barco(cargaBarco, 45, 30, 10, "Brasil", 5)); 

        System.out.println("\n--------------------------- Lista de Transportes ---------------------------\n");
        for (Transporte transporte : transportes) {
            System.out.println(transporte.toString());
            System.out.println("\n---------------------------------------------------------------------------------\n");
        }
    }
}
