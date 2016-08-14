package lang_features

import org.junit.Test

class SafeGraphTest {
    class A {
        def field1;
    }

    @Test
    void shouldSafelyNavigate() {
        A a = null
        assert a?.field1 == null
    }
}
