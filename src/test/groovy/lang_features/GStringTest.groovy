package lang_features

import org.junit.Test

class GStringTest {

    @Test
    void shouldInjectVariable() {
        def var = 10
        assert "$var" == "10"
    }

    @Test
    void shouldInjectMethodCall() {
        assert "${getTen()}" == "10"
    }

    def getTen() {
        return 10
    }
}
