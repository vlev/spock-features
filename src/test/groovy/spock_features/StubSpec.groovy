package spock_features

import spock.lang.Specification

class StubSpec extends Specification {
    interface Subscriber {
        String receive(String message)
    }

    def "stub should return ok"() {
        Subscriber subscriber = Mock()
        subscriber.receive(_) >> "ok"

        expect:
        subscriber.receive('do stuff') == 'ok'
    }
}
