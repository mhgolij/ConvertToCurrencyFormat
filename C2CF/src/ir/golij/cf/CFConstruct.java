package ir.golij.cf;

public abstract class CFConstruct {
    private String sign;
    private String Separator;
    public CFConstruct(){
        this.sign = iCF.Sign.ENGLISHSIGN.getSymbol();
        this.Separator = iCF.Sign.ENGLISH.getSymbol();
    }
    public CFConstruct(String sign){
        this.sign = sign;
        this.Separator = iCF.Sign.ENGLISH.getSymbol();
    }
    public CFConstruct(String sign, String Symbol){
        this.sign = sign;
        this.Separator = Symbol;
    }
    public String getSign() {
        return sign;
    }

    public String getSeparator() {
        return Separator;
    }

}
