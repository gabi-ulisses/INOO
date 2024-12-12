package com.ibag.validator.model;

public class ValidadorSenha {

    public ValidadorSenha() {}

    public boolean validarSenha(String senha) {
        // Verifica se a senha tem pelo menos 8 caracteres
        if (senha.length() < 8) {
            return false;
        }

        boolean temNumero = false;
        boolean temCaractereEspecial = false;
        boolean temLetraMaiuscula = false;

        // Lista de caracteres especiais
        String especiais = "!@#$%^&*()-+=";

        // Verifica cada caractere da senha
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                temNumero = true;
            } 
            if (Character.isUpperCase(c)) {
                temLetraMaiuscula = true;
            } 
            if (especiais.indexOf(c) != -1) {
                temCaractereEspecial = true;
            }

            // Sai todos os critérios forem atendidos
            if (temNumero && temCaractereEspecial && temLetraMaiuscula) {
                return true;
            }
        }

        return false; 
    }
}
