package com.dark.spockexample.exception;

import java.security.InvalidParameterException;

public class Calculator {

	public int sum(Integer param1, Integer param2) throws InvalidParameterException {
		if (param1 == null || param2 == null)
			throw new InvalidParameterException("Negative argument is invalid!");

		return param1 + param2;
	}
}
