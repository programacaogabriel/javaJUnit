package br.com.exercicio3.JUnitEquals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidacaoIgualdade {
	
	@Test
	public void validacaoIgualdadeSucesso() {
		String resultadoObtido="Registo salvo com sucesso!";
		assertEquals("Registo salvo com sucesso!", resultadoObtido);
		
	}

	@Test
	public void validacaoIgualdadeFalha() {
		String resultadoObtid ="Registro excluido com sucesso!";
		assertEquals("Registro salvo com sucesso!",resultadoObtid);
	}
	
}
