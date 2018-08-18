package com.dark.spockexample.exception

import com.dark.spockexample.exception.Calculator
import spock.lang.Specification

import java.security.InvalidParameterException

class ExceptionTest extends Specification {

	def "test sum if parameter is null"() {
		given:
		def calculator = new Calculator()

		when:
		calculator.sum(null, 2)

		then:
		thrown InvalidParameterException
	}

	def "test sum if parameter is not null"() {
		given:
		def calculator = new Calculator()

		when:
		calculator.sum(1, 2)

		then:
		notThrown InvalidParameterException
	}
}
