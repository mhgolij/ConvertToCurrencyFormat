package ir.golij.cf;

public interface iCF {
    String c2Mony(Object money);
    static double verifyMoney(Object money){
        double newNum = 0;
        if (money instanceof String){
            newNum = Double.parseDouble((String) money);
        } else if (money instanceof Integer) {
            newNum = Double.parseDouble(String.valueOf(money));
        }else if (money instanceof Float) {
            newNum = Double.parseDouble(String.valueOf(money));
        }else if (money instanceof Double) {
            newNum = Double.parseDouble(String.valueOf(money));
        }else{
            return 0.0;
        }
        return newNum;
    }

    static String jS(double DNumber, String separator){
        String number = Double.toString(DNumber);
        String newValue =number.replace(".",separator);
        return newValue;
    }

    enum Sign {
        PERSIAN("/"),
        ENGLISH("."),
        PERSIANSIGN("﷼"),
        ENGLISHSIGN("$");

        private String symbol;
        Sign(String symbol){
            this.symbol = symbol;
        }


        public String getSymbol(){
            return symbol;
        }

    }
}
