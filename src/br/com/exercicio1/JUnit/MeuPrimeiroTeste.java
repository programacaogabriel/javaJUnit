package br.com.exercicio1.JUnit;

import org.junit.jupiter.api.Test;

public class MeuPrimeiroTeste {

	@Test
	public void teste1() {
		System.out.println("Teste 1 executado");
	}
	
	@Test
	public void teste2() {
		System.out.println("Teste 2 executado");
	}
	
	
	public void naoEUmTeste() {
		System.out.println("Esta mensagem n�o deve aparecer");
	}
}
