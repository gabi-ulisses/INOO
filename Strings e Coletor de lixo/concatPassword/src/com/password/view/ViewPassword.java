package com.password.view;
import com.password.model.Pessoa;

public class ViewPassword {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
    
        System.out.println("Senha gerada: "+p.gerarSenha(p.getPrimeiroNome(), p.getNomeDoMeio(), p.getUltimoNome()));
    }
}
