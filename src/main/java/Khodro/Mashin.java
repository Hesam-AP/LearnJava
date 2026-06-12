package Khodro;

public class Mashin extends Khodro{
    boolean ayaDarBazAst;
    String mark;

    public Mashin(String mark) {
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
}