package com.rohit.objectpool;

/*
 * Mock Database connection objects,
 * Assumption is that they are expensive to create.
 */
public class DatabaseConnection {

	private static int index = 1;
	private final int identity;
	
	public DatabaseConnection() {
		identity = index++;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int getIdentity() {
		return identity;
	}
	
	@Override
	public String toString() {
		return String.format("Database connection id: %d" , identity);
	}
}
