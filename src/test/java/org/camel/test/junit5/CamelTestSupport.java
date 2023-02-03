package org.camel.test.junit5;

import org.junit.jupiter.api.BeforeEach;

class CamelTestSupport {

	@BeforeEach
	void setUp() {
		System.out.println("setUp CamelTestSupport");
	}

}
