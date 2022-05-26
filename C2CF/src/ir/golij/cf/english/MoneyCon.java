package ir.golij.cf.english;

import ir.golij.cf.CFConstruct;
import ir.golij.cf.iCF;

public class MoneyCon extends CFConstruct implements iCF {
    public MoneyCon(){
        super();
    }
    public MoneyCon(String sign){
        super(sign);
    }
    public MoneyCon(String sign,String separator){
        super(sign,separator);
    }

    @Override
    public String c2Mony(Object money) {
        double newNum = iCF.verifyMoney(money);
        String pNum = iCF.jS(newNum,getSeparator());
        return getSign() + pNum;
    }


    public static String cMoney(Object money){
        double number = iCF.verifyMoney(money);
        String pNum = iCF.jS(number, Sign.ENGLISH.getSymbol());
        return Sign.ENGLISHSIGN.getSymbol() + pNum;
    }
    public static String cMoney(Object money,String sign){
        double number = iCF.verifyMoney(money);
        String pNum = iCF.jS(number,Sign.ENGLISH.getSymbol());
        return sign + pNum;
    }
    public static String cMoney(Object money,String sign,String separator){
        double number = iCF.verifyMoney(money);
        String pNum = iCF.jS(number,separator);
        return sign + pNum;
    }
}
