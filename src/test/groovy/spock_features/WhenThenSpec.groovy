package spock_features

import spock.lang.Specification

class WhenThenSpec extends Specification {
    def "set shouldn't throw NPE"() {
        def set = new HashSet()

        when:
        set.add(null)

        then:
        noExceptionThrown()
    }
}
