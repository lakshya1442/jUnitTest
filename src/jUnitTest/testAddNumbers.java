package jUnitTest;

import static org.junit.Assert.*;
import org.junit.Test;

public class testAddNumbers {
	
	@Test
	public void test() {
		jUnitFunctions jUnit1=new jUnitFunctions();
		int result=jUnit1.sum(100,200);
		assertEquals(300,result);
		
	}

}

