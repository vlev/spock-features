package lang_features

import org.junit.Test

class DataStructuresTest {

    @Test
    void shouldWorkWithDataStructures() {
        def list = [1, 4, 6, 9]

        // by default, keys are Strings, no need to quote them
        def map = [CA: 'California', MI: 'Michigan']
        def range = 10..20

        // equivalent to add()/put()
        list << 5
        map << [WA: 'Washington']

        assert 4 in list
        assert 15 in range
        assert list[1] == 4
        assert map['CA'] == 'California'

        // property notation
        assert map.WA == 'Washington'
    }
}