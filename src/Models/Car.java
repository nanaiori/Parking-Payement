package Models;


import java.time.LocalDateTime;

import utils.ArroundPrice;


public class Car extends Vehicule {

	public Car(TypeVehicule type) {
		
		super(type);
		
	}

	public double calculFacture(LocalDateTime beginDate, LocalDateTime endDate) {
		 long duration = calculateDuration(beginDate, endDate);
	        for (PriceCalcul price : PriceCalcul.values()) {
	            if (price.isApplicable(duration)) {
	                return ArroundPrice.round(price.calculate(duration));
	            }
	        }
	        return 0d;
	}
	
	

}
