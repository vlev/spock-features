package lang_features

import org.junit.Test

class JDKStringTest {

    @Test
    void shouldGetSubstring() {
        java.lang.String s = 'abcde'
        assert s.getAt(1..2) == 'bc' //method from Groovy JDK
    }
}
