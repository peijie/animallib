package Animal;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestBase {
    protected ByteArrayOutputStream testOutput = new ByteArrayOutputStream();

    @Before
    public void setupOutput() {
        System.setOut(new PrintStream(testOutput));
    }

    @After
    public void restoreOutput() {
        System.setOut(System.out);
    }
}
