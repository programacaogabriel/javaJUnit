package br.com.exercicio12.timeout;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RegraTempoExecucaoTest {
	
	@Rule	public Timeout timeoutGlobal=Timeout.seconds(1);
	
	@Test
	public void falhaPorTimeOut() throws InterruptedException {
		Thread.sleep(1001);
	}

}
