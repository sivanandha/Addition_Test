package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void testAddd() {
		Add add=new Add();
		final int actual=add.addd(4, 5);
		final int expected=10;
		assertEquals(expected, actual);
		
	}

}
