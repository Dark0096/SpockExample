### Problem Definition
다른 Mock Object 에게 Callback 을 전달했을때, 명시적으로 실행하지 않으면 어떤 코드가 제대로 전달되었는지 확인하기 쉽지 않다.
이 경우 Mock Object 에게 전달된 Callback 을 명시적으로 호출할 수 있다.

### Solution
Mock Object 에게 전달된 Callback Parameter 를 명시적으로 실행하기.

#### Reference
[Closure Pattern](https://stackoverflow.com/questions/21113794/how-to-call-a-method-or-closure-in-a-where-clause-in-a-spock-test)