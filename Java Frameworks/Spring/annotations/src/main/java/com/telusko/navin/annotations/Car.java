package com.telusko.navin.annotations;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
public void drive() {
		
		System.out.println("Chal raha hai...");
	}

}
