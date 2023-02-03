package org.camel.test;

import org.junit.jupiter.api.BeforeEach;

abstract class RouteTestSupport extends CamelTestSupport {

	@Override
	@BeforeEach
	void setUp() {
		super.setUp();
		System.out.println("setUp RouteTestSupport");
	}

	@BeforeEach
	void init() {
		System.out.println("init RouteTestSupport");
	}

}
