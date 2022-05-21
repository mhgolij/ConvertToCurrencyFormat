package ir.golij.convertor;

public class PMoneyCon extends PMoneyConString {


    public PMoneyCon(){
        super();
    }

    public PMoneyCon(String separator){
        super(separator);
    }

    public PMoneyCon(String separator,String sign){
        super(separator,sign);
    }


    public static String cMony(double pm , String separator,String s){
        String m = e2p(pm,separator);
        return s+m;
    }

    public static String cMony(double pm,String s){
        String m = e2p(pm);
        return s+m;
    }

    public static String cMony(double pm){
        String m = e2p(pm);
        return SIGN+m;
    }

    public String c2Mony(double pm){
        String m = e2p(pm,this.separator);
        return this.sign+m;
    }

}
