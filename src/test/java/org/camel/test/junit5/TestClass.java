package org.camel.test.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClass extends RouteTestSupport {

	@Override
	@BeforeEach
	void setUp() {
		super.setUp();
		System.out.println("setUp TestClass");
	}

	/**
	 * Run with JUnit 5 Runner
	 */
	@Test
	void test() {
		System.out.println("Test");
	}

}
