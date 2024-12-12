class ValidadorSenha {

    public boolean validarSenha(String senha) {
        if (senha.length() < 8) {
            return false; // Deve ter pelo menos 8 caracteres
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
            } else if (Character.isUpperCase(c)) {
                temLetraMaiuscula = true;
            } else if (especiais.indexOf(c) != -1) {
                temCaractereEspecial = true;
            }

            // Sai do loop cedo se todos os critérios forem atendidos
            if (temNumero && temCaractereEspecial && temLetraMaiuscula) {
                return true;
            }
        }

        return false; // Faltou atender algum critério
    }
}