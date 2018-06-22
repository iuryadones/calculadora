package calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SomaTest {

	public int valorX, valorY, resposta;
	
	@Before
	public void atribuiValores() {
		valorX = 10;
		valorY = 5;
		resposta = 15;
	}

	@After
	public void exibiValores() {
		Soma soma = new Soma();

		System.out.println("Esperado: "+valorX+" + "+valorY+" = "+resposta);
		System.out.println("Gerado: "+valorX+" + "+valorY+" = "+soma.calc(valorX, valorY));
		
	}

	@Test
	public void somarValorXcomValorY() {
		Soma soma = new Soma();

		assertEquals(resposta, soma.calc(valorX, valorY));
	}

}
