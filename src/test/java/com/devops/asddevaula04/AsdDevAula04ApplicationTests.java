package com.devops.asddevaula04;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AsdDevAula04ApplicationTests {

	
	@Test
	public void deveRetornar2500EmRomano() {
		String esperado = "MMD";
				
		String resultadoEmRomano = AsdDevAula04Application.toRoman(2500);
		assertEquals(esperado, resultadoEmRomano);
	}
	
	@Test
	public void deveRetornar2000EmRomano() {
		String esperado = "MM";
		
		String resultadoEmRomano = AsdDevAula04Application.toRoman(2000);
		assertEquals(esperado, resultadoEmRomano);
	}
	
	@Test (expected = NullPointerException.class)
	public void deveRetornarErroComNumeroNegativo() {
		AsdDevAula04Application.toRoman(-1999);
	}

}
