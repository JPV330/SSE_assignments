package com.ss.mod4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LineTest {

	Line l = new Line(1, 2, 3, 4);
	Line alpha = new Line(2, 3, 8, 9);

	@Test
	public void testGetSlope() {
		
		assertEquals(new Double(1.0), (Double) l.getSlope());
		
	}

	@Test
	public void testGetDistance() {
		
		assertEquals(new Double(2.8284271247461903), (Double) l.getDistance());
		
	}

	@Test
	public void testParallelTo() {

		assertEquals(new Boolean(true), l.parallelTo(alpha));

	}

}
