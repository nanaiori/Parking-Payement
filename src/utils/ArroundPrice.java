package utils;


public class ArroundPrice {

    public static Double round(Double amount) {
        Double scale = amount - amount.intValue();
        if(scale.compareTo(0.5) > 0) {
            return Double.valueOf(amount.intValue() + 1d);
        } else if(scale.compareTo(Double.valueOf(0)) != 0 && scale.compareTo(0.5) < 0){
            return Double.valueOf(amount.intValue() + 0.5);
        } else {
            return amount.doubleValue();
        }
    }

}
