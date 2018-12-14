package com.dark.spockexample.callback;

import java.util.concurrent.atomic.AtomicLong;

public class Client {
	private final CallbackInvoker callbackInvoker;

	private AtomicLong invokeCounter = new AtomicLong(0);

	public Client(CallbackInvoker callbackInvoker) {
		this.callbackInvoker = callbackInvoker;
	}

	public void invoke() {
		callbackInvoker.invoke(() -> invokeCounter.incrementAndGet());
	}

	public long getInvokeCount() {
		return invokeCounter.get();
	}
}
