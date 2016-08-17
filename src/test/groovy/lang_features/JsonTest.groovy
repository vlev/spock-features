package lang_features

import groovy.json.JsonParserType
import groovy.json.JsonSlurper
import org.junit.Test

class JsonTest {

    @Test
    void shouldParseJson() {
        def jsonSlurper = new JsonSlurper(type: JsonParserType.INDEX_OVERLAY)
        def object = jsonSlurper.parseText('{ "myList": [4, 8, 15, 16, 23, 42] }')

        assert object instanceof Map
        assert object.myList instanceof List
        assert object.myList == [4, 8, 15, 16, 23, 42]
    }
}
