package org.camel.test.junit4;

import org.junit.Before;

public abstract class RouteTestSupport extends CamelTestSupport {

	@Override
	public void setUp() {
		super.setUp();
		System.out.println("setUp RouteTestSupport");
	}

	@Before
	public void init() {
		System.out.println("init RouteTestSupport");
	}

}
