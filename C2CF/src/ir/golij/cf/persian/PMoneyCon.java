package ir.golij.cf.persian;

import ir.golij.cf.CFConstruct;
import ir.golij.cf.iCF;

public class PMoneyCon extends CFConstruct implements iCF,iE2P{



    public PMoneyCon(){
        super(Sign.PERSIANSIGN.getSymbol(),Sign.PERSIAN.getSymbol());
    }
    public PMoneyCon(String sign){
        super(sign,Sign.PERSIAN.getSymbol());
    }
    public PMoneyCon(String sign,String separator){
        super(sign,separator);
    }



    public String c2Mony(Object money){
        double newNum = iCF.verifyMoney(money);
        String pNum = iE2P.e2p(newNum,getSeparator());
        return getSign() + pNum;
    }



    public static String cMoney(Object money){
        double number = iCF.verifyMoney(money);
        String pNum = iE2P.e2p(number,Sign.PERSIAN.getSymbol());
        return Sign.PERSIANSIGN.getSymbol() + pNum;
    }
    public static String cMoney(Object money,String sign){
        double number = iCF.verifyMoney(money);
        String pNum = iE2P.e2p(number,Sign.PERSIAN.getSymbol());
        return sign + pNum;
    }
    public static String cMoney(Object money,String sign,String separator){
        double number = iCF.verifyMoney(money);
        String pNum = iE2P.e2p(number,separator);
        return sign + pNum;
    }


}
