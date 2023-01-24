package com.softtek.nethaji.FirstProjectByNaveen;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.softtek.demo.WishMessageGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("/FirstProjectByNaveen/src/main/java/com/softtek/config"));
		Object object = factory.getBean("wmg");
		WishMessageGenerator generator=(WishMessageGenerator)object;
		String result=generator.generateWishMessage("raja");
		System.out.println(result);
    }
}
