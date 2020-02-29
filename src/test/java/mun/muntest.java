package mun;

import static org.junit.Assert.*;

import org.junit.Test;

public class muntest {
mun o= new mun();
	@Test
	public void test() {
		int x=5;
		int y=5;
		int sum = o.add(x,y);
		assertTrue(10==sum);
		
	}

}
