package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTestTest {

	@Test
	public void testTestAddd() {
		Add a1=new Add();
		int actual=a1.addd(8, 10);
		int expected=18;
		assertEquals(expected, actual);
	}

}
