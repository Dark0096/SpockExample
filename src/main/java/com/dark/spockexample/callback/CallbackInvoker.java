package com.dark.spockexample.callback;

public class CallbackInvoker {

	public void invoke(Callback callback) {
		callback.call();
	}
}
