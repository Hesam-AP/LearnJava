
import Khodro.Mashin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MashinTest {
    @Test
    void barassi_tavanaei_harakat_mashin() {
        Mashin pride = new Mashin("Pride");
        Mashin benz = new Mashin("Benz");

        pride.RoshanKardan();
        pride.BazKardanDar();
        boolean ayaPrideHarakatmikonad = pride.ayaDarHarakatAst();
        benz.RoshanKardan();
        benz.BastanDar();
        boolean ayaBenzHarakatMikonad = benz.ayaDarHarakatAst();

        assertFalse(ayaPrideHarakatmikonad);
        assertTrue(ayaBenzHarakatMikonad);

    }
}
