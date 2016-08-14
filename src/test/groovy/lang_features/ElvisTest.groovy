package lang_features

import org.junit.Test

class ElvisTest {

    @Test
    void shouldExecuteElvisExpression() {
        def s = 'hello'
        assert 'hello' == s ?: 'bye'

        s = null
        assert 'bye' == s ?: 'bye'
    }
}
