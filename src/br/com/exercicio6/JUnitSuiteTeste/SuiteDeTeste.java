package br.com.exercicio6.JUnitSuiteTeste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.exercicio1.JUnit.MeuPrimeiroTeste;
import br.com.exercicio2.JUnitAssertTrueFalse.ValidacaoVerdadeiroFalso;
import br.com.exercicio3.JUnitEquals.ValidacaoIgualdade;
import br.com.exercicio4.JUnit.BeforeAfter.PreEPosCondicoesDeTeste;
import br.com.exercicio5.JUnit.BeforeClassAfterClass.PreEPosCondicoesDaClasse;

@RunWith(Suite.class)
@SuiteClasses({
	MeuPrimeiroTeste.class,
	ValidacaoVerdadeiroFalso.class,
	ValidacaoIgualdade.class,
	PreEPosCondicoesDeTeste.class,
	PreEPosCondicoesDaClasse.class
})
public class SuiteDeTeste {

}
