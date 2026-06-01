
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MashinTest {
    @Test
    void barassi_tavanaei_harakat_mashin() {
        // Given
        Mashin pride = new Mashin("Pride");
        Mashin benz = new Mashin("Benz");
        // When
        pride.RoshanKardan();
        pride.BazKardanDar();
        boolean ayaPrideHarakatmikonad = pride.aya_mashin_mitavanad_harakat_konad();
        benz.RoshanKardan();
        benz.BastanDar();
        boolean ayaBenzHarakatMikonad = benz.aya_mashin_mitavanad_harakat_konad();
        // Then
        Assertions.assertFalse(ayaPrideHarakatmikonad);
        Assertions.assertTrue(ayaBenzHarakatMikonad);

    }

    class Mashin {
        boolean ayaMashinRoshanAst;
        boolean ayaDarBazAst;
        String mark;

        Mashin() {
            System.out.println("yek mashin bedon data ijad shod");
        }
        Mashin(String mark) {
            this.mark = mark;
            System.out.println("Yek Mashin "+ this.mark +" Ijad shod");
        }

        void RoshanKardan() {
            System.out.println("Mashin Roshan Shod");
            ayaMashinRoshanAst = true;
        }
        void KhamoshKardan() {
            System.out.println("Mashin Khamosh Shod");
            ayaMashinRoshanAst = false;
        }
        void BazKardanDar() {
            System.out.println("Dar Baz Shod");
            ayaDarBazAst = true;
        }
        void BastanDar() {
            System.out.println("Dar Baste Shod");
            ayaDarBazAst = false;
        }
        boolean aya_mashin_mitavanad_harakat_konad() {
            return !ayaDarBazAst && ayaMashinRoshanAst;
        }
    }
}
