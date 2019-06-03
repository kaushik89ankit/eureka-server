package com.disha.pmg.eureka_server;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Hi again");

		Employee ankit = new Employee("Ankit", "Kaushik", 1000);

		boolean valid = isValid(ankit);

		if (valid) {
			System.out.println(ankit + " is valid");
			return;
		}

		System.out.println(ankit + " is not valid");
	}

	public static boolean isValid(Employee employee) {

		if (employee.getSalary() > 0)
			return true;

		return false;
	}
}
