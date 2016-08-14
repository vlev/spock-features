package spock_features

import spock.lang.Specification

class InteractionSpec extends Specification {
    class Publisher {
        def subscribers = []

        void subscribe(Subscriber subscriber) {
            subscribers << subscriber
        }

        void publish(String message) {
            subscribers.each { it.receive(message) }
        }
    }

    interface Subscriber {
        String receive(String message)
    }

    def "should publish messages to subscriber"() {
        Subscriber subscriber = Mock()
        def publisher = new Publisher()
        publisher.subscribe(subscriber)

        when:
        publisher.publish('hi boys!')
        publisher.publish('hi girls!')

        then:
        1 * subscriber.receive('hi boys!')
        1 * subscriber.receive('hi girls!')
    }
}
