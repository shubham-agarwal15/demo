package com.example.demo;

import java.util.Objects;

public class DemoClass1 {

	Integer a = 23;
	
	public void funcUnformatted()
	{
		if(Objects.isNull(a)) { a = 4;}
		else {System.out.println(a); }
	}
}
