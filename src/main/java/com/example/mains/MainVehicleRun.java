package com.example.mains;


import com.example.entities.DrinksEntity;
//import com.example.entities.VehicleEntity;
import com.example.repositories.ProductRepository;

public class MainVehicleRun {
	 public static void main(String[] args) {
//		 VehicleEntity vehicleEntity = new VehicleEntity();
//		 vehicleEntity.setMake("BMW");
//		 vehicleEntity.setModel("MCM");
//		 vehicleEntity.setYear(2018);
//		 vehicleEntity.setType("Sedan");
//		 
//		 ProductRepository vehicleRepository =  new ProductRepository();
//		 vehicleRepository.save(vehicleEntity);
//
//		 
		 DrinksEntity nishan = new DrinksEntity();
		 nishan.setMake(2009l);
		 nishan.setName("Vodka");
		 nishan.setType("Green");
		 nishan.setPrice(39d);
		 
		 ProductRepository drinks =  new ProductRepository();
		 drinks.save(nishan);
		 
	
		 
	 }
}
