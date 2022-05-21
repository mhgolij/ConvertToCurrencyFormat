package ir.golij.convertor;

public class MoneyCon extends MoneyConString {
    public MoneyCon(){
        super();
    }
    public MoneyCon(String sign){
        super(sign);
    }

    public static String cMony(double m , String s){
        return s+m;
    }

    public static String cMony(double m){
        return SIGN+m;
    }

    public String c2Mony(double m){
        return this.sign+m;
    }

}
