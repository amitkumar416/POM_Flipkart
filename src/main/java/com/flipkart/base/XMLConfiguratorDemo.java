package com.flipkart.base;


import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLConfiguratorDemo {
	
	static Logger logger = Logger.getLogger(XMLConfiguratorDemo.class);

	public static void main(String[] args) {
		
		DOMConfigurator.configure("log4j.xml");
		
		logger.debug("its good");
		
		logger.info("yes info");
		
		logger.warn("yes warn");
		
		logger.error("yes error");
		
		logger.fatal("yes fatal");
		
		
		
	}

}
