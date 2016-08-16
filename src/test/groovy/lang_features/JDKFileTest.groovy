package lang_features

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class JDKFileTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder()

    @Test
    void shouldReadFile() {
        java.io.File file = temporaryFolder.newFile()
        file.write('hi boys!') //method from Groovy JDK
        def lines = file.readLines() //method from Groovy JDK
        assert lines[0] == 'hi boys!'
    }
}
