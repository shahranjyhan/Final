package com.TuroHooks;

import com.TuroBase.Turo_Base_Class;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Turo_Hooks_Class extends Turo_Base_Class {
	
	@Before
	public static void initialize() {
		Turo_Base_Class.setup();
	}
	
	@After
	public static void TearDown() {
		driver.close();
	}

}
