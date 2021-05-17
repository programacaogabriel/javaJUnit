package br.com.exercicio4.JUnit.BeforeAfter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreEPosCondicoesDeTeste {
	
	@Before
	public void preCondicoes() {
		System.out.println("Executou a pre condicao");
	}
	
	@Test
	public void exibicaoPreCondicaoTeste1() {
		System.out.println("Executou o Teste 1");
	}
	
	@Test
	public void exibicaoPrePosCondicaoTeste2() {
		System.out.println("Executou o Teste 2");
	}
	
	@After
	public void posCondicao() {
		System.out.println("Executou a pos condicao");
	}

}
