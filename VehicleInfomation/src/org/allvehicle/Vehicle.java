package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	private void VehicleNecessary() {
		System.out.println("vehicleNecessary: Two-wheeler ");

	}
public static void main(String[] args) {
	Vehicle v =new Vehicle();
	v.VehicleNecessary();
	
	TwoWheeler tw =new TwoWheeler();
	tw.bike();
	tw.cycle();
	
	ThreeWheeler tw1 =new ThreeWheeler();
	tw1.auto();
	
	FourWheeler fw =new FourWheeler();
	fw.car();
	fw.bus();
	fw.lorry();
}

	
}
