package br.com.exercicio2.JUnitAssertTrueFalse;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidacaoVerdadeiroFalso {

	@Test
	public void validacaoVerdadeiroSucesso() {
		boolean campoEstaPresente = true;
		assertTrue(campoEstaPresente);
	}
	
	@Test
	public void validacaoVerdadeiroFalha() {
		boolean campoEstaPresente=true;
		assertFalse("Campo não está presente", campoEstaPresente);
	}
}
