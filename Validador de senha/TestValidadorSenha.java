import org.junit.Test;
import org.junit.Assert;

public class TestValidadorSenha{
    @Test
    public void test_SeAClasseExiste(){
        ValidatorSenha vs = new ValidadorSenha();
        Assert.assertNotNull(vs);
    }
    
    @Test
    public void test_Minimo8Caracteres_p1(){
        
        //Arrange
        ValidatorSenha vs = new ValidadorSenha();
        
        //Act
        boolean resultadoAtual = vs.validarSenha("teste12");
        
        //Assert
        boolean resultadoEsperado = false;
        Assert.assertEquals(resultadoAtual, resultadoEsperado);  
    }
    
    @Test
    public void test_Minimo8Caracteres_p2(){
        
        //Arrange
        ValidatorSenha vs = new ValidadorSenha();
        
        //Act
        boolean resultadoAtual = vs.validarSenha("teste1234");
        
        //Assert
        boolean resultadoEsperado = true;
        Assert.assertEquals(resultadoAtual, resultadoEsperado);  
    }
    
      @Test
      public void test_PossuirUmNumero_p1(){
        
        //Arrange
        ValidatorSenha vs = new ValidadorSenha();
        
        //Act
        boolean resultadoAtual = vs.validarSenha("testeabcdefg");
        
        //Assert
        boolean resultadoEsperado = false;
        Assert.assertEquals(resultadoAtual, resultadoEsperado);  
    }
    
    @Test
      public void test_PossuirUmNumero_p2(){
        
        //Arrange
        ValidatorSenha vs = new ValidadorSenha();
        
        //Act
        boolean resultadoAtual = vs.validarSenha("testeabc33");
        
        //Assert
        boolean resultadoEsperado = true;
        Assert.assertEquals(resultadoAtual, resultadoEsperado);  
    }
    
    @Test
    public void test_PossuirCaractereEspecial_p1() {
    // Arrange
    ValidadorSenha vs = new ValidadorSenha();

    // Act
    boolean resultadoAtual = vs.validarSenha("Teste123");

    // Assert
    boolean resultadoEsperado = false;
    Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }
    
    @Test 
    public void test_PossuirCaractereEspecial_p2() {
    // Arrange
    ValidadorSenha vs = new ValidadorSenha();

    // Act
    boolean resultadoAtual = vs.validarSenha("Teste123!");

    // Assert
    boolean resultadoEsperado = true;
    Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }
    
    @Test
    public void test_PossuirLetraMaiuscula_p1() {
    // Arrange
    ValidadorSenha vs = new ValidadorSenha();

    // Act
    boolean resultadoAtual = vs.validarSenha("teste123!");

    // Assert
    boolean resultadoEsperado = false;
    Assert.assertEquals(resultadoAtual, resultadoEsperado);
        
    }
    
    @Test
    public void test_PossuirLetraMaiuscula_p2() {
    // Arrange
    ValidadorSenha vs = new ValidadorSenha();

    // Act
    boolean resultadoAtual = vs.validarSenha("Teste123!");

    // Assert
    boolean resultadoEsperado = true;
    Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }
}



