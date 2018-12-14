package groovy.com.dark.spockexample.closure

import com.dark.spockexample.closure.Coupang
import com.dark.spockexample.closure.Product
import spock.lang.Shared
import spock.lang.Specification

class CoupangTest extends Specification {

	@Shared
	Coupang coupang

	void setup() {
		coupang = new Coupang()
	}

	def "should increase the order count of product type"() {
		when:
		coupang.order(product)

		then:
		expectedOrderCount.call() == 1l

		where:
		product          || expectedOrderCount
		Product.NOTEBOOK || { coupang.getNotebookOrderCount() }
		Product.PAPER    || { coupang.getPaperOrderCount() }
		Product.PENCIL   || { coupang.getPencilOrderCount() }
		Product.UNKNOWN  || { coupang.getUnknownOrderCount() }
	}
}