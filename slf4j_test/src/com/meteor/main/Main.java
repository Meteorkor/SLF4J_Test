package com.meteor.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("aaa");
		//Logger logger = LoggerFactory.getLogger(Main.class);
		Logger logger = LoggerFactory.getLogger("client");
		
		logger.info("info1");
		logger.error("error1");
		
		logger.debug("debug11");
		
		String tex = "asd";
		String tex2 = "asdss";
		logger.info("{}{}",tex,tex2);
		
	}

}
