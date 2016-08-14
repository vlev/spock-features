package lang_features

import org.junit.Test

class ClosureTest {

    @Test
    void shouldIncValues() {
        assert [1, 2, 3].collect { it + 1 } == [2, 3, 4]
    }
}
