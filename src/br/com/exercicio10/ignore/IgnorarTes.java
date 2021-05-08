package br.com.exercicio10.ignore;

import org.junit.Ignore;
import org.junit.Test;

public class IgnorarTes {

	
	@Test
	public void test1() {
		
	}
	
	@Test
	@Ignore
	public void testIgnorado() {
		
	}
	
	@Test
	@Ignore (value="Teste Ignorado para Exemplo")
	public void testeIgnoradoComMotivo() {
		
	}
}
