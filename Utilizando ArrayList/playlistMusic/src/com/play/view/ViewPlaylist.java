package com.play.view;

import java.util.ArrayList;

import com.play.model.Music;

public class ViewPlaylist {
    public static void main(String[] args) {
        
        Music m1 = new Music("Penumbra", "Djonga");
        Music m2 = new Music("Esperar o sol", "Flora Matos");
        Music m3 = new Music("Piloto", "Flora Matos");
        Music m4 = new Music("Teia", "Flora Matos");
        Music m5 = new Music("10:45", "Flora Matos");
        Music m6 = new Music("O Jeito", "Flora Matos");

        ArrayList<Music> playlist = new ArrayList<>();

        playlist.add(m1);
        playlist.add(m2);
        playlist.add(m3);
        playlist.add(m4);
        playlist.add(m5);
        playlist.add(m6);

        for(Music m : playlist){
            System.out.println("\nA música "+ m.getTitulo() +" ("+m.getCompositor()+") foi adicionada com sucesso!");
        }

        System.out.println("\nRemovendo...\n");

        for(int i = 0; i < (playlist.size() - 1); i++){
            System.out.println("A música "+ playlist.get(i).getTitulo() +" ("+playlist.get(i).getCompositor()+") foi removida com sucesso!\n");
            playlist.remove(i);
        }

        int soma = 0;

        System.out.println("\nAgora temos...\n");

        for(Music m : playlist){
                System.out.println("    a música "+ m.getTitulo() +" ("+m.getCompositor()+"), que está armazenada na posição "+ playlist.indexOf(m)+".");
                soma++;
        }

        System.out.println("\nTotalizando: "+soma+" músicas!\n");
    }
}
