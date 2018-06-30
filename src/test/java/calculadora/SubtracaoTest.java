package test.java.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.calculadora.Subtracao;

public class SubtracaoTest {
	
	public int valorX, valorY, resposta;

	
	@Before
	public void atribuiValores() {
		valorX = 5;
		valorY = 5;
		resposta = 10 ;
		
	}
	
	@After
	public void exibiValores() {
	Subtracao subtracao = new Subtracao();
	
	System.out.println("Esperado: "+valorX+" - "+valorY+" = "+resposta);

	}
	
	@Test
	public void subtrairValorXcomValorY() {
		Subtracao subtracao = new Subtracao();
		
		assertEquals(resposta, subtracao.calc(valorX, valorY)); 

	}
	
} 
		
	
	
