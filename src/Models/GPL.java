package Models;

import java.time.LocalDateTime;

import utils.ArroundPrice;

public class GPL extends Vehicule implements MajREDU {
	
    public GPL(TypeVehicule type) {
		super(type);
		
	}

	@Override
    public double calculFacture(LocalDateTime beginDate, LocalDateTime endDate) {
		
    	double amount = 0;
    	double divide = 0;
    	long duration = calculateDuration(beginDate, endDate);
        for (PriceCalcul price : PriceCalcul.values()) {
            if (price.isApplicable(duration)) {
                amount= price.calculate(duration);
                divide = amount * majoration;
                return ArroundPrice.round(amount+divide);
            }
        }
        return 0d;
      
    }


}
