package com.example.restservice;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class CountryService {
	public static Country getCountry(String code)
	{
		System.out.println("hello");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    	ArrayList<Country> country =new ArrayList<Country>();
    	 country = context.getBean("countryList", java.util.ArrayList.class);
    	 //Iterating through all elements of List
    	 int a=1;
         for(Country g : country) {
        	 System.out.println("hello123");
             if(g.getCode().equalsIgnoreCase(code))
             {
            	 a=0;
                return g;
             }
         }
    	 if(a==1)
    	 {
    		 throw new CountryNotFoundException();
    	 }
        
         System.out.println("hello789");
		return null;
        
	}
}
