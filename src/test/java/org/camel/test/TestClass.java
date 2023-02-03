package org.camel.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClass extends RouteTestSupport {

	@Override
	@BeforeEach
	void setUp() {
		super.setUp();
		System.out.println("setUp TestClass");
	}

	@Test
	void test() {
		System.out.println("Test");
	}

}
