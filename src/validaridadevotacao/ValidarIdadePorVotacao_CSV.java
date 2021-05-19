package validaridadevotacao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters;

import br.com.datadriven.Votacao;

@RunWith(BlockJUnit4ClassRunnerWithParameters.class)
public class ValidarIdadePorVotacao_CSV {

	@Test
	@CsvFileSource(value= "src/validaridadevotacao/massa_de_dados.csv", 
	mapper = CsvWithHeaderMapper.class)
	public void validarIdadeDeVoto(String nome, int anoDeNascimento,String resultado) {
	assertEquals(resultado,Votacao.podeVotar(nome, anoDeNascimento));
			
	}
}
