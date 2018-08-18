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
}