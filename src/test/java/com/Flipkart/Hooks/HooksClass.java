package com.Flipkart.Hooks;

import com.Flipkart.Baseclass.Baseclass;

import io.cucumber.java.Before;

public class HooksClass extends Baseclass{
	
	Baseclass base = new Baseclass();

	@Before
	
	public void browserlaunch() {
		base.browserlaunch();
	}
}
	
	