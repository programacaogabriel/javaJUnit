package br.com.datadriven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ValidarIdadePorVotacao {
	
	@Test
	public void idadeIgual15Anos_NaoPodeVotar() {
		assertEquals("Maria voce nao pode votar", Votacao.podeVotar("Maria",2006));
				
	}
	
	@Test
	public void idadeIgual16Anos_VotoFacultativo() {
		assertEquals("Rodrigo seu voto e facultativo",Votacao.podeVotar("Rodrigo", 2005));
	
	}
	
	@Test
	public void idadeIgual17Anos_VotoFacultativo() {
		assertEquals("Joao seu voto e facultativo", Votacao.podeVotar("Joao", 2004));
	}
	
	@Test
	public void idadeIgual18Anos_VotoObrigatorio() {
		assertEquals("Carla seu voto e obrigatorio", Votacao.podeVotar("Carla", 2003));
	}
	@Test
	public void idadeIgual25Anos_VotoObrigatorio() {
		assertEquals("Jose seu voto e obrigatorio", Votacao.podeVotar("Jose",1996));
	}
	@Test
	public void idadeIgual70Anos_VotoObrigatorio() {
		assertEquals("Anna seu voto e obrigatorio",Votacao.podeVotar("Anna", 1951));
	}
	@Test
	public void idadeIgual71Anos_VotoObrigatorio() {
		assertEquals("Pedro seu voto e facultativo", Votacao.podeVotar("Pedro", 1949));
	}
}
