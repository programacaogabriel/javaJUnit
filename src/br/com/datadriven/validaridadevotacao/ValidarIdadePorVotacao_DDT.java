package validaridadevotacao;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import br.com.datadriven.Votacao;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_DDT {

	//MODO PADRAO
	String nome;
	int anoDeNascimento;
	String resultado;

	public ValidarIdadePorVotacao_DDT(String nome, int anoDeNascimento, String resultado) {
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimento;
		this.resultado = resultado;
	}

	@Test
	public void validarObrigatoriedadeDeVoto() {

		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}

	@Parameters(name = ("{0} |{1}|{2}"))
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ "Maria", 2006, "Maria voce nao pode votar" },
				{ "Rodrigo", 2005, "Rodrigo seu voto e facultativo" }, 
				{ "Joao", 2004, "Joao seu voto e facultativo" },
				{ "Carla", 2003, "Carla seu voto e obrigatorio" }, 
				{ "Jose", 1996, "Jose seu voto e obrigatorio" },
				{ "Anna", 1951, "Anna seu voto e obrigatorio" }, 
				{ "Pedro", 1949, "Pedro seu voto e facultativo" } 
				});

	}

}
