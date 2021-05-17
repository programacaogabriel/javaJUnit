package br.com.exercicio5.JUnit.BeforeClassAfterClass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PreEPosCondicoesDaClasse {

	
	@BeforeClass
	public static void preCondicaoAntesClasse() {
		System.out.println("Executou antes de todos os testes");
	}
	
	
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
	
	@AfterClass
	public static void posCondicaoDepoisClasse() {
		System.out.println("Executou depois de todos os testes");
	}
	
}
