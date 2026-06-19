package Khodro;

public class Mashin extends Khodro implements SandogDar, GearBox{
    boolean ayaDarBazAst;
    String mark;

    public Mashin(String mark, int ZarfiyatSandog, String GearBox) {
        this.mark = mark;
    }

    public void BazKardanDar() {
        ayaDarBazAst = true;
    }
    public void BastanDar() {
        ayaDarBazAst = false;
    }
    public boolean ayaDarHarakatAst() {
        return !ayaDarBazAst && ayaRoshanAst;
    }

    @Override
    public String getMark() {
        return mark;
    }

    @Override
    public double Zarfiyat() {
        return 100;
    }

    @Override
    public String gearbox() {
        return "Automatic";
    }
}