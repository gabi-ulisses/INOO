package com.ibag.validator.view;

import org.junit.Test;
import org.junit.Assert;
import com.ibag.validator.model.ValidadorSenha;

public class TestValidadorSenha {

    @Test
    public void test_SeAClasseExiste() {
        ValidadorSenha vs = new ValidadorSenha();
        Assert.assertNotNull(vs);
    }

    @Test
    public void test_Minimo8Caracteres_p1() {
        ValidadorSenha vs = new ValidadorSenha();
        boolean resultadoAtual = vs.validarSenha("teste12");
        boolean resultadoEsperado = false;
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void test_Minimo8Caracteres_p2() {
        ValidadorSenha vs = new ValidadorSenha();
        boolean resultadoAtual = vs.validarSenha("teste1234");
        boolean resultadoEsperado = false; // Ainda faltam caracteres especiais
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void test_PossuirUmNumero_p1() {
        ValidadorSenha vs = new ValidadorSenha();
        boolean resultadoAtual = vs.validarSenha("testeabcdef");
        boolean resultadoEsperado = false;
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void test_PossuirUmNumero_p2() {
        ValidadorSenha vs = new ValidadorSenha();
        boolean resultadoAtual = vs.validarSenha("Teste123!");
        boolean resultadoEsperado = true;
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void test_PossuirCaractereEspecial_p1() {
        ValidadorSenha vs = new ValidadorSenha();
        boolean resultadoAtual = vs.validarSenha("Teste123");
        boolean resultadoEsperado = false;
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void test_PossuirCaractereEspecial_p2() {
        ValidadorSenha vs = new ValidadorSenha();
        boolean resultadoAtual = vs.validarSenha("Teste123!");
        boolean resultadoEsperado = true;
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void test_PossuirLetraMaiuscula_p1() {
        ValidadorSenha vs = new ValidadorSenha();
        boolean resultadoAtual = vs.validarSenha("teste123!");
        boolean resultadoEsperado = false;
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void test_PossuirLetraMaiuscula_p2() {
        ValidadorSenha vs = new ValidadorSenha();
        boolean resultadoAtual = vs.validarSenha("Teste123!");
        boolean resultadoEsperado = true;
        Assert.assertEquals(resultadoEsperado, resultadoAtual);
    }
}
