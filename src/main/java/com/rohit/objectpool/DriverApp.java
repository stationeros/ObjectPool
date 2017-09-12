package com.rohit.objectpool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverApp {

	private static final Logger LOGGER = LoggerFactory.getLogger(DriverApp.class);
	
	public static void main(String[] args) {
		DatabaseConnectionPool pool = new DatabaseConnectionPool();
		LOGGER.info(pool.toString());
		DatabaseConnection connection = pool.getObject();
		LOGGER.info("Got object {}", connection);
		LOGGER.info(pool.toString());
		DatabaseConnection connection1 = pool.getObject();
		LOGGER.info("Got object {}", connection1);
		DatabaseConnection connection2 = pool.getObject();
		LOGGER.info("Got object {}", connection2);
		LOGGER.info("Returning back to pool {}" , connection);
		pool.returnBackToPool(connection);
		LOGGER.info(pool.toString());
		LOGGER.info("Returning back to pool {}" , connection2);
		pool.returnBackToPool(connection2);
		LOGGER.info(pool.toString());
	}
}
