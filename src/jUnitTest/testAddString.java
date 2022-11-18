package jUnitTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testAddString {
	
	@Test
	public void test() {
	jUnitFunctions jUnit2=new jUnitFunctions();
	String result=jUnit2.addString("ram","sita");
	assertEquals("ramsita",result);
	}

}
