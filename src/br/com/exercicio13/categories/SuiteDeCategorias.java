package br.com.exercicio13.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(Positivos.class)
@SuiteClasses({
	TesteCategorizado.class
})
public class SuiteDeCategorias {

}
