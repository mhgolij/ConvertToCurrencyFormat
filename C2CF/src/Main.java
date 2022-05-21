import ir.golij.convertor.*;

public class Main {
    public static void main(String[] args) {
        MoneyCon.cMony(15); // $15.0
        MoneyCon.cMony(15,"ریال"); //ریال15.0
        MoneyCon d = new MoneyCon();
        d.c2Mony(12); //12.0 $
        MoneyCon c = new MoneyCon("RIAL");
        c.c2Mony(12); //RIAL12.0
        PMoneyCon.cMony(15); //﷼۱۵/۰
        PMoneyCon.cMony(15,"."); //﷼۱۵.۰
        PMoneyCon.cMony(15,".","$"); //$۱۵.۰
        PMoneyCon a = new PMoneyCon();
        a.c2Mony(12); //﷼۱۲/۰
//-----------------------------
        PMoneyCon f = new PMoneyCon("*");
        f.c2Mony(12); //﷼۱۲*۰
//-----------------------------
        PMoneyCon g = new PMoneyCon("*","$");
        g.c2Mony("12"); //$۱۲*۰
    }
}