import Khodro.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MotorTest {
    @Test
    void barresi_tavanaei_harakat_motor() {
        // Given
        Motor click = new Motor();
        // When
        click.RoshanKardan();
        // Then
        assertTrue(click.ayaDarHarakatAst());
    }
}
