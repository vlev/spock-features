package spock_features

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class DataDrivenSpec extends Specification {

    def "max of #a and #b should be #c"() {
        expect:
        Math.max(a, b) == c
        where:
        a | b | c
        1 | 2 | 2
        0 | 0 | 0
        3 | 2 | 3
    }
}
