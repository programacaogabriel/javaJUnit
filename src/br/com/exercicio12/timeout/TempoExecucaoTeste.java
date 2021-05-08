package br.com.exercicio12.timeout;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TempoExecucaoTeste {

	
	@Test(timeout = 1000)
	public void naoPassaPeloTimeOut() {
		assertTrue(true);
	}
	
	@Test(timeout = 1000)
	public void apresentaErroTimeOut() throws InterruptedException {
		Thread.sleep(1001);
	}
	
}
