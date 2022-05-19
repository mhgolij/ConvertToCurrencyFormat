package Convertor;

public class PMoneyCon {
// define constant symbols , you can change them if you wants
    public static final String SIGN = "﷼";
    public static final String SEPARATOR = "/";

    private String sign;
    private String separator;

//    convert number to persian with default or manual separator
    public static String e2p(String number){
        String newValue = number.replace("1","۱").replace("2","۲").replace("3","۳").replace("4","۴").replace("5","۵")
                .replace("6","۶").replace("7", "۷").replace("8","۸").replace("9","۹").replace("0","٠").replace(".",SEPARATOR);
        return newValue;
    }
    public static String e2p(String number,String separator){
        String newValue = number.replace("1","۱").replace("2","۲").replace("3","۳").replace("4","۴").replace("5","۵")
                .replace("6","۶").replace("7", "۷").replace("8","۸").replace("9","۹").replace("0","٠").replace(".",separator);
        return newValue;
    }



    public PMoneyCon(){
        this.sign = SIGN;
        this.separator = SEPARATOR;
    }
    public PMoneyCon(String separator){
        this.sign = SIGN;
        this.separator = separator;
    }
    public PMoneyCon(String separator,String sign){
        this.sign = sign;
        this.separator = separator;
    }


    public static String cMony(double pm , String separator,String s){
        String m = e2p(Double.toString(pm),separator);
        return s+m;
    }
    public static String cMony(double pm,String s){
        String m = e2p(Double.toString(pm));
        return s+m;
    }
    public static String cMony(double pm){
        String m = e2p(Double.toString(pm));
        return SIGN+m;
    }
    public String c2Mony(double pm){
        String m = e2p(Double.toString(pm),this.separator);
        return this.sign+m;
    }
}
