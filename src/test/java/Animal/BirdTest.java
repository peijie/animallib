package Animal;

import org.junit.*;
import static org.assertj.core.api.Assertions.*;

public class BirdTest extends TestBase {

    @Test
    public void testFly() {
        Bird bird = new Bird();
        bird.fly();
        assertThat(testOutput.toString()).isEqualTo("I am flying\r\n");
    }

    @Test
    public void testSing() {
        Bird bird = new Bird();
        bird.sing();
        assertThat(testOutput.toString()).isEqualTo("I am Singing\r\n");
    }

}
