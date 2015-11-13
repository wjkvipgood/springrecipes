package com.apress.springrecipes.sequence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/apress/springrecipes/sequence/beans.xml");
		/*SequenceGenerator generator = (SequenceGenerator) context.getBean("sequenceGenerator3");
		System.out.println(generator.getSequence3());
		System.out.println(generator.getSequence3());*/
		
		/*SequenceGenerator generator2 = (SequenceGenerator) context.getBean("sequenceGenerator2");
		System.out.println(generator2.getSequence());
		System.out.println(generator2.getSequence());*/
		
		/*SequenceGenerator generatorUseGenerator = (SequenceGenerator) context.getBean("sequenceGeneratorUseGenerator");
		System.out.println(generatorUseGenerator.getSequenceUseGenerator());
		System.out.println(generatorUseGenerator.getSequenceUseGenerator());*/
		
		/*SequenceGenerator sequenceGeneratorUseFormattedSuffix = (SequenceGenerator) context.getBean("sequenceGeneratorUseFormattedSuffix");
		System.out.println(sequenceGeneratorUseFormattedSuffix.getSequenceUseFormattedSuffix());
		System.out.println(sequenceGeneratorUseFormattedSuffix.getSequenceUseFormattedSuffix());*/
		
		SequenceGenerator sequenceGeneratorUseUtilSet = (SequenceGenerator) context.getBean("sequenceGeneratorUseUtilSet");
		System.out.println(sequenceGeneratorUseUtilSet.getSequenceUseUtilSet());
		System.out.println(sequenceGeneratorUseUtilSet.getSequenceUseUtilSet());
	}
}
