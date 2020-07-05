package Facture;

import java.time.LocalDateTime;

import Models.Car;
import Models.GPL;
import Models.Moto;
import Models.TypeVehicule;
import Models.Vehicule;

public class Facture {

	public static void main(String[] args) {
		
		Vehicule v = new GPL(TypeVehicule.ESSENCE);
		Vehicule v1 = new Car(TypeVehicule.ESSENCE);
		Vehicule v2 = new Moto(TypeVehicule.ESSENCE);
		
		LocalDateTime a = LocalDateTime.of(2020, 07, 05, 07, 43); 
		LocalDateTime b = LocalDateTime.of(2020, 07, 05, 15, 10);
		LocalDateTime a1 = LocalDateTime.of(2020, 07, 05, 13, 24); 
		LocalDateTime b1 = LocalDateTime.of(2020, 07, 05, 15, 10);
		LocalDateTime a2 = LocalDateTime.of(2020, 07, 05, 19, 30); 
		LocalDateTime b2 = LocalDateTime.of(2020, 07, 06, 00, 37);
		
		System.out.println("**********************************************************************************");
		
		System.out.println(" Vehicule : " + v.GetName());
		System.out.println(" Temp passé : " +v.AfficherDuration(a, b));
		System.out.println("  Montant du : " + v.calculFacture(a,b) + " euros ");
		
		System.out.println("**********************************************************************************");
		
		System.out.println(" Vehicule : " + v1.GetName());
		System.out.println(" Temp passé : " + v1.AfficherDuration(a1, b1));
		System.out.println(" Montant du : " + v1.calculFacture(a1,b1) + " euros ");
		
		
		System.out.println("**********************************************************************************");
		
		System.out.println(" Vehicule : " + v2.GetName());
		System.out.println(" Temp passé  : " +v2.AfficherDuration(a2, b2));
		System.out.println(" Montant du : " + v2.calculFacture(a2,b2) + " euros ");
		
	}

}
