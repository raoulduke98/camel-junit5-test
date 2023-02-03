package org.camel.test.junit4;

import org.junit.Test;

public class TestClass extends RouteTestSupport {

	@Override
	public void setUp() {
		super.setUp();
		System.out.println("setUp TestClass");
	}

	/**
	 * Run with JUnit 4 Runner
	 */
	@Test
	public void test() {
		System.out.println("Test");
	}

}
