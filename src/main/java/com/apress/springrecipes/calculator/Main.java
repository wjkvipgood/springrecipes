package com.apress.springrecipes.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/apress/springrecipes/calculator/beans.xml");
		
		ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) context.getBean("arithmeticCalculator");
		arithmeticCalculator.add(1, 2);
		arithmeticCalculator.sub(4, 3);
		arithmeticCalculator.mul(2, 3);
		arithmeticCalculator.div(4, 2);
		arithmeticCalculator.div(3, 0);
		
		UnitCalculator unitCalculator = (UnitCalculator) context.getBean("unitCalculator");
		unitCalculator.kilogramToPound(10);
		unitCalculator.kilometerToMile(5);
	}
}