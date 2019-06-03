package com.disha.pmg.eureka_server;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void checkValidity() {

		Employee emp = new Employee("Anusha", "Srivatsava", 8080);
		assertEquals(true, App.isValid(emp));
	}

}
