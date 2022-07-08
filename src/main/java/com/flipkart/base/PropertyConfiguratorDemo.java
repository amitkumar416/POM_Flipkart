package com.flipkart.base;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyConfiguratorDemo {

	Logger log = Logger.getLogger(PropertyConfiguratorDemo.class);

	@BeforeClass
	public void beforeClass() {
		PropertyConfigurator.configure(".\\src\\main\\resources\\Config\\log4j.properties");
	}

	@Test
	public void test1() {
		log.debug("is debug works");
	}

	@Test
	public void test2() {
		log.info("is info works");
	}
}
