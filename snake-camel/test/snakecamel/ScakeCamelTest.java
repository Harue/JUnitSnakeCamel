package snakecamel;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Test;

public class ScakeCamelTest {

	@Test
	public void snakeToCamelcase文字列を分裂し頭を大文字にする() {
		String st="SnakeCase";
		String actual=SnakeCamelUtil.snakeToCamelcase("snake_case");
		assert(actual.equals(st));
	}
@Test
public void camelToSnakecase分解する(){
	String s="snake_case";
	String ac = SnakeCamelUtil.camelToSnakecase("SnakeCamel");
	assert(ac.equals(s));
}
@Test
public void capitalize大文字(){
	String s1="Snakecase";
	String a1=SnakeCamelUtil.capitalize("snakecase");
	assert(a1.equals(s1));
}
}
