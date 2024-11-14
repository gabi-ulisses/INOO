package com.password.model;

public class Pessoa {
    private String primeiroNome;
    private String nomeDoMeio;
    private String ultimoNome;
    private String senha;

    public Pessoa(){
        this.primeiroNome = "gabrielle";
        this.nomeDoMeio = "ulisses";
        this.ultimoNome = "silva";
    }

    public String getPrimeiroNome(){
        return primeiroNome;
    }

    public String getNomeDoMeio(){
        return nomeDoMeio;
    }

    public String getUltimoNome(){
        return ultimoNome;
    }

    public String gerarSenha(String primeiroNome, String nomeDoMeio, String ultimoNome){
        
        int tam = primeiroNome.length();
        
        senha = primeiroNome.substring(0, 1);
        senha = senha+primeiroNome.substring((tam -1), tam);

        tam = nomeDoMeio.length();

        int inicio = 0;
        int meio = (inicio + tam)/2;

        if ((meio % 2) != 0) {
            meio += 1;
        }

        senha = senha+nomeDoMeio.substring(0, meio);

        tam = ultimoNome.length();
        
        String m = ultimoNome.substring(1, 2);

        for(int i = 2; i < tam; i++){
            if (i % 2 != 0) {
                m = m+ultimoNome.substring(i, i+1);
            }                        
        }

        return senha+m.toUpperCase();
    }
}
