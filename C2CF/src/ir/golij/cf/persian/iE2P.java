package ir.golij.cf.persian;

public interface iE2P {
    static String e2p(double DNumber, String separator){
        String number = Double.toString(DNumber);
        String newValue = number.replace("1","۱").replace("2","۲").replace("3","۳").replace("4","۴").replace("5","۵")
                .replace("6","۶").replace("7", "۷").replace("8","۸").replace("9","۹").replace("0","٠").replace(".",separator);
        return newValue;
    }
}
