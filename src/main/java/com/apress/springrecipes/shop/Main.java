package com.apress.springrecipes.shop;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/apress/springrecipes/shop/beans.xml");
		/*Product aaa = (Product) context.getBean("aaa");
		System.out.println(aaa);
		Product cdrw = (Product) context.getBean("cdrw");
		System.out.println(cdrw);
		
		Product aaaUseFactory = (Product) context.getBean("aaaUseFactory");
		System.out.println(aaaUseFactory);
		Product cdrwUseFactory = (Product) context.getBean("cdrwUseFactory");
		System.out.println(cdrwUseFactory);
		
		Product aaaUseStaticMethod = (Product) context.getBean("staticFactoryMethodAaa");
		System.out.println(aaaUseStaticMethod);
		Product cdrwUseStaticMethod = (Product) context.getBean("staticFactoryMethodCdrw");
		System.out.println(cdrwUseStaticMethod);
		
		Product aaaUseMemberFactoryMethod = (Product) context.getBean("memberFactoryMethodAaa");
		System.out.println(aaaUseMemberFactoryMethod);
		Product cdrwUseMemberFactoryMethod = (Product) context.getBean("memberFactoryMethodCdrw");
		System.out.println(cdrwUseMemberFactoryMethod);
		
		Product aaaFromStaticProperty = (Product) context.getBean("staticPropertyAaa");
		System.out.println(aaaFromStaticProperty);
		Product cdrwFromStaticProperty = (Product) context.getBean("staticPropertyCdrw");
		System.out.println(cdrwFromStaticProperty);
		
		Product aaaFromMemberProperty = (Product) context.getBean("bestSeller");
		System.out.println(aaaFromMemberProperty);*/
		
		Product aaa = (Product) context.getBean("aaa");
		Product cdrw = (Product) context.getBean("cdrw");
		Product dvdrw = (Product) context.getBean("dvdrw");
		
		ShoppingCart cart1 = (ShoppingCart) context.getBean("shoppingCart");
		cart1.addItem(aaa);
		cart1.addItem(cdrw);
		System.out.println("Shopping cart1 contains " + cart1.getItems());
		
		ShoppingCart cart2 = (ShoppingCart) context.getBean("shoppingCart");
		cart2.addItem(dvdrw);
		System.out.println("Shopping cart2 contains " + cart2.getItems());
		
		Cashier casher1 = (Cashier)context.getBean("cashier1");
		casher1.checkout(cart1);
	}
}
