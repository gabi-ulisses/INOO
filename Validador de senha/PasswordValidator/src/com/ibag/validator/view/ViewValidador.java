package com.ibag.validator.view;

import java.util.Scanner;

import com.ibag.validator.model.Validador;

public class ViewValidador {
    public static void main(String[] args) {
        Validador validador = new Validador();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma senha para validar:");

        String senha = scanner.nextLine();
        
        if (validador.validarSenha(senha)) {
            System.out.println("Senha válida! Atende aos critérios.");
        } else {
            System.out.println("Senha inválida. Não atende aos critérios.");
        }

        scanner.close();
    }
}
