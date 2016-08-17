package lang_features

import groovy.json.JsonSlurper
import org.junit.Test

class JsonTest {

    @Test
    void shouldParseJson() {
        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{ "myList": [4, 8, 15] }')
        assert object instanceof Map
        assert object.myList instanceof List
        assert object.myList == [4, 8, 15]
    }
}
