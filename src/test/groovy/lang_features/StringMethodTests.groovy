package lang_features

import org.junit.Test

class StringMethodTests {

    @Test
    void checkStringMethod() {
        assert "do some stuff"(2) == 4
    }

    def "do some stuff"(arg) {
        return arg + arg
    }
}
