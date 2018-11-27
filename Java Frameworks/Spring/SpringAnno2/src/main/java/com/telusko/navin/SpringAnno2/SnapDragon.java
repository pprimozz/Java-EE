package com.telusko.navin.SpringAnno2;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	public void process() {
		System.out.println("World best CPU");

	}

}
