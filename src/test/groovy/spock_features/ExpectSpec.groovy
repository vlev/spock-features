package spock_features

import spock.lang.Specification

class ExpectSpec extends Specification {

    def "max of 1 and 2 should be 2"() {
        expect:
        Math.max(1, 2) == 2
    }
}
