package groovy.com.dark.spockexample.callback

import com.dark.spockexample.callback.Callback
import com.dark.spockexample.callback.CallbackInvoker
import com.dark.spockexample.callback.Client
import spock.lang.Specification

class ClientTest extends Specification {

	def "should increase the invoke count"() {
		given:
		def callbackInvoker = Mock(CallbackInvoker)
		def client = new Client(callbackInvoker)

		callbackInvoker.invoke(_) >> { Callback callback ->
			callback.call()
		}

		when:
		client.invoke()

		then:
		client.getInvokeCount() == 1l
	}
}
