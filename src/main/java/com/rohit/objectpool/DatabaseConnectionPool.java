package com.rohit.objectpool;

public class DatabaseConnectionPool extends ObjectPool<DatabaseConnection>{

	@Override
	protected DatabaseConnection createObject() {
		return new DatabaseConnection();
	}
}
