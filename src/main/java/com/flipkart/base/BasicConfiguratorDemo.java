package com.flipkart.base;



import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorDemo {

	static Logger logger = Logger.getLogger(BasicConfiguratorDemo.class);
	
	public static void main(String[] args) {
		
		
		
		BasicConfigurator.configure();
		
		logger.debug("warn basic");
		logger.error("debug work");
		logger.warn("debug work");
		logger.info("debug work");
		logger.fatal("debug work");
	}

}
