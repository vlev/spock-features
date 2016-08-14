package lang_features

import org.junit.Test

class SwitchTest {

    @Test
    void shouldDoSwitch() {
        def x = 1.23
        def result = ""
        switch (x) {
            case "foo": result = "found foo"
            case "bar": result += "bar"
            case [4, 5, 6, 'inList']:
                result = "list"
                break
            case 12..30:
                result = "range"
                break
            case Integer:
                result = "integer"
                break
            case Number:
                result = "number"
                break
            case { it > 3 }:
                result = "number > 3"
                break
            default: result = "default"
        }
        assert result == "number"
    }
}
