package Models;

import java.time.LocalDateTime;
import utils.ArroundPrice;

public class Moto extends Vehicule implements MajREDU {

	  public Moto(TypeVehicule type) {
		  
		super(type);
		
	}

	@Override
	   public double calculFacture(LocalDateTime beginDate, LocalDateTime endDate) {	
		  
		  long duration = calculateDuration(beginDate, endDate);
	        for (PriceCalcul price : PriceCalcul.values()) {
	            if (price.isApplicable(duration)) {
	                return ArroundPrice.round(price.calculate(duration)*reduction);
	            }
	        }
	        return 0d;
	    }

}
