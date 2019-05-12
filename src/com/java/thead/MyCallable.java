package com.java.thead;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	private long waitTime;

	public MyCallable() {
		super();
		this.waitTime = 1000;

	}

	public MyCallable(int timeInMillis) {
		this.waitTime = timeInMillis;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(waitTime);
		// return the thread name executing this callable task
		return Thread.currentThread().getName();
	}

}
