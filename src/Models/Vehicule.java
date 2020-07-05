package Models;

import java.time.Duration;
import java.time.LocalDateTime;


public abstract  class Vehicule {
	
	
	private TypeVehicule type;

	
	 public Vehicule(TypeVehicule type) {
		 
		 this.type = type;
	}

	public TypeVehicule getType() {
		return type;
	}

	public void setType(TypeVehicule type) {
		this.type = type;
	}

	public abstract double calculFacture(LocalDateTime beginDate, LocalDateTime endDate);
	 
	 public  long calculateDuration(LocalDateTime beginDate, LocalDateTime endDate) {
	           
	        Duration duration = Duration.between(beginDate, endDate);
	        
	        return duration.toMinutes();
	 }
	
	 public  String AfficherDuration(LocalDateTime beginDate, LocalDateTime endDate) {
		 
         long diff=calculateDuration(beginDate, endDate);
         long diffhours = diff/60;
         long diffMinutes = diff%60;
	   
         return diffhours+"h"+diffMinutes;
	
	 }
	 
	 public String GetName() {
		 
		 return getClass().getSimpleName() + " "+ getType();
	 }
}
