package Khodro;

public abstract class Khodro{

    boolean ayaRoshanAst;

    public void RoshanKardan() {
        ayaRoshanAst = true;
    }
    public void KhamoshKardan() {
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHarakatAst();

    public abstract String getMark();
}
