package Animal;


import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class ParrotTest extends TestBase {

    @Test
    public void testParrotNearDoc() {
        Parrot parrot = new Parrot(new Dog());
        parrot.sing();
        assertThat(testOutput.toString()).isEqualTo("Woof, woof\r\n");
    }

    @Test
    public void testParrotNearCat() {
        Parrot parrot = new Parrot(new Cat());
        parrot.sing();
        assertThat(testOutput.toString()).isEqualTo("Meow\r\n");
    }

    @Test
    public void testParrotWithRooster() {
        Rooster rooster = new Rooster();
        Parrot parrot = new Parrot(rooster);

        parrot.sing();
        assertThat(testOutput.toString()).isEqualTo("Cock-a-doodle-doo\r\n");
    }

}
