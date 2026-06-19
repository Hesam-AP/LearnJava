package Khodro;

public class NameKhodroChapKon {

    static Khodro[] KhodroList;
    public NameKhodroChapKon(Khodro[] khodroha) {
        this.KhodroList = khodroha;
    }

    public static String execute() {
        String result = "";
        for (int i = 0; i < KhodroList.length; i++ ) {
            Khodro khodro = KhodroList[i];
            if (i == KhodroList.length - 1) {
                result += khodro.getMark();
            } else {
                result = result + khodro.getMark() + "-";
            }
        }
        return result;
    }
}
