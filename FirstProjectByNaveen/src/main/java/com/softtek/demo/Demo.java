package com.softtek.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Demo {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
				"C:/Users/nethaji.d/servlets/FirstProjectByNaveen/src/main/java/com/softtek/config/ApplicationContext.xml"));
		Object object = factory.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator) object;
		String result = generator.generateWishMessage(" raja");
		System.out.println(result);

	}
}
