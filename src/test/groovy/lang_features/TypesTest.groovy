package lang_features

import org.junit.Test

class TypesTest {

    @Test
    void shouldCalculateSum() {
        def a = 10
        def b = 2
        assert getSum(a, b) == 12
    }

    def getSum(a, b) {
        return a + b
    }
}
