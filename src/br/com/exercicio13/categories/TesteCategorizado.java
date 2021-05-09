package br.com.exercicio13.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TesteCategorizado {

	@Test
	@Category(Smoke.class)
	public void test1() {
		
	}
	
	@Test
	@Category(Positivos.class)
	public void test2() {
		
	}
	
	@Test
	public void test3() {
		
	}
}
