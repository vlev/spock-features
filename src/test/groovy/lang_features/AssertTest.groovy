package lang_features

import org.junit.Test

class AssertTest {
    class Wrapper {
        List<String> list;

        @Override
        String toString() {
            return 'wrapper for ' + list?.toString()
        }
    }

    @Test
    void shouldFailOnWrapper() {
        def w = new Wrapper()
        w.list = [1, 2]
        assert w.list == [2, 3]
    }

    @Test
    void shouldFailOnSet() {
        Set<String> set = ['a', 'b']
        assert set.contains('c')
    }
}
