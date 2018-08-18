package com.dark.spockexample.array

import spock.lang.Specification

class ArrayTest extends Specification {

	def "test array comparison"() {
		when:
		def array1 = ["a": [1.0, 2.0]]
		def array2 = ["a": [3.0, 4.0]]

		then:
		array1.each { index, values ->
			// if don't use assert, always success
			assert values == array2.get(index)
		}
	}

	def "test array by using data table"() {
		when:
		def array = ARRAY
		def expectedValue = EXPECTED_VALUE

		then:
		array.each { index, values ->
			// if don't use assert, always success
			assert values == expectedValue.get(index)
		}

		where:
		ARRAY                              || EXPECTED_VALUE
		["a": [1.0, 2.0]]                  || ["a": [1.0, 2.0]]
		["a": [1.0, 2.0], "b": [1.0, 2.0]] || ["a": [1.0, 2.0], "b": [1.0, 2.0]]
	}
}