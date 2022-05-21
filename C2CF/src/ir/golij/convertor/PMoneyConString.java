package ir.golij.convertor;

public class PMoneyConString extends E2PDigit{

    protected String sign;
    protected String separator;
    public static final String SIGN = "﷼";
//    public static final String SEPARATOR = "/";


    public PMoneyConString(){
        this.sign = SIGN;
        this.separator = SEPARATOR;
    }

    public PMoneyConString(String separator){
        this.sign = SIGN;
        this.separator = separator;
    }

    public PMoneyConString(String separator,String sign){
        this.sign = sign;
        this.separator = separator;
    }

    public static String cMony(String ps , String separator,String s){
        double pm = Double.parseDouble(ps);
        String m = e2p(pm,separator);
        return s+m;
    }
    public static String cMony(String ps,String s){
        double pm = Double.parseDouble(ps);
        String m = e2p(pm);
        return s+m;
    }
    public static String cMony(String ps){
        double pm = Double.parseDouble(ps);
        String m = e2p(pm);
        return SIGN+m;
    }
    public String c2Mony(String ps){
        double pm = Double.parseDouble(ps);
        String m = e2p(pm,this.separator);
        return this.sign+m;
    }
}
