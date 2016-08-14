package lang_features

import org.junit.Test

class JDKListTest {

    @Test
    void shouldCollectValues() {
        java.util.List<Integer> list = [1, 2, 3]
        assert list.collect { it * 2 } == [2, 4, 6] //method from Groovy JDK
    }
}
