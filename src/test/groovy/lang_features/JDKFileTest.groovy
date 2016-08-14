package lang_features

import org.junit.After
import org.junit.Before
import org.junit.Test

class JDKFileTest {
    java.io.File file;

    @Before
    void init() {
        def tmp = System.getProperty('java.io.tmpdir')
        file = new java.io.File("$tmp\\groovy-test.txt")
    }

    @After
    void finalize() {
        file.delete()
    }

    @Test
    void shouldReadFile() {
        file.write('hi boys!') //method from Groovy JDK
        def lines = file.readLines() //method from Groovy JDK
        assert lines[0] == 'hi boys!'
    }
}
