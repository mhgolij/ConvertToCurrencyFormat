package ir.golij.convertor;

public class MoneyConString {
    public static final String SIGN = "$";
    protected String sign;
    protected String separator;
    public MoneyConString(){
        this.sign = SIGN;
    }
    public MoneyConString(String sign){
        this.sign = sign;
    }

    public static String cMony(String dm , String s){
        double m = Double.parseDouble(dm);
        return s+m;
    }

    public static String cMony(String dm){
        double m = Double.parseDouble(dm);
        return SIGN+m;
    }
    public String c2Mony(String dm){
        double m = Double.parseDouble(dm);
        return this.sign+m;
    }
}
