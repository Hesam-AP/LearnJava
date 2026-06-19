package Khodro;

public class Motor extends Khodro{

    public String mark;
    public Motor(String mark) {
        this.mark = mark;
    }

    public boolean ayaDarHarakatAst() {
        return ayaRoshanAst;
    }

    @Override
    public String getMark() {
        return mark;
    }
}
