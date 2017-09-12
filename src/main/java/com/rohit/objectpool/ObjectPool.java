package com.rohit.objectpool;

import java.util.HashSet;
import java.util.Set;

public abstract class ObjectPool<T> {

	private Set<T> obtainable = new HashSet<T>();
	private Set<T> currentlyInUse = new HashSet<T>();

	protected abstract T createObject();

	// Get object from pool.
	public synchronized T getObject() {
		if (obtainable.isEmpty()) {
			obtainable.add(createObject());
		}
		T objInstance = obtainable.iterator().next();
		obtainable.remove(objInstance);
		currentlyInUse.add(objInstance);
		return objInstance;
	}

	public synchronized void returnBackToPool(T instance) {
		currentlyInUse.remove(instance);
		obtainable.add(instance);
	}

	@Override
	public synchronized String toString() {
		return String.format("Pool available=%d inUse=%d", obtainable.size(), currentlyInUse.size());
	}
}
