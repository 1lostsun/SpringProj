package com.lost.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

	private Computer comp;

	public void build() {
		comp.compile();
		System.out.println("Doing awesome project");
	}

	@Autowired
	@Qualifier("desktop")
	public void setComp(Computer comp) {
		this.comp = comp;
	}

}
