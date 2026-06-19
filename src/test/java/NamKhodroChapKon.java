import Khodro.Khodro;
import Khodro.Mashin;
import Khodro.Motor;
import Khodro.NameKhodroChapKon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamKhodroChapKon {
    @Test
    void bayad_nam_khodro_ra_chap_konad() {

        // Given
        Khodro benz = new Mashin("Benz",120,"Automatic");
        Khodro bmw = new Mashin("Bmw",80,"Manual");
        Khodro suzuki = new Motor("Suzuki");
        Khodro[] khodroha = {benz,bmw,suzuki};
        NameKhodroChapKon nameKhodroChapKon = new NameKhodroChapKon(khodroha);

        // When
        String ListKhodroha = NameKhodroChapKon.execute();

        // Then
        Assertions.assertEquals("Benz-Bmw-Suzuki",ListKhodroha);

    }
}
