package Convertor;

public class MoneyCon {
    public static final String SIGN = "$";
    private String sign;

    public MoneyCon(){
        this.sign = SIGN;
    }
    public MoneyCon(String sign){
        this.sign = sign;
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
