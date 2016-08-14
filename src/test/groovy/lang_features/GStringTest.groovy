package lang_features

import org.junit.Test

class GStringTest {

    @Test
    void shouldInjectVariable() {
        def var = 10
        assert '$var' == '$var' // java.util.String
        assert "$var" == "10" //GString
    }

    @Test
    void shouldInjectMethodCall() {
        assert "${getTen()}" == "10"
    }

    def getTen() {
        return 10
    }
}
