import ir.golij.cf.english.MoneyCon;
import ir.golij.cf.persian.PMoneyCon;

public class Main {
    public static void main(String[] args) {
        MoneyCon.cMoney(15);
        MoneyCon.cMoney(15,"ریال");
        MoneyCon.cMoney(15,"ریال","/");
        MoneyCon d = new MoneyCon();
        d.c2Mony(12);
        MoneyCon c = new MoneyCon("RIAL");
        c.c2Mony(12);
        MoneyCon e = new MoneyCon("RIAL","/");
        e.c2Mony(12);
        PMoneyCon.cMoney(15);
        PMoneyCon.cMoney(15,"$");
        PMoneyCon.cMoney(15,"$","/");
        PMoneyCon a = new PMoneyCon();
        a.c2Mony(12);
//-----------------------------
        PMoneyCon f = new PMoneyCon("$");
        f.c2Mony(12);
//-----------------------------
        PMoneyCon g = new PMoneyCon("$","*");
        g.c2Mony("12");
    }
}