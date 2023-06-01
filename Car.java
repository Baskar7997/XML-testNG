package testNG;

import org.testng.annotations.Test;

public class Car {
      @Test(priority = 0)
	public void startTheCar() {
		System.out.println("start the car");
	}
      @Test(priority = 1)
     public void firstGear() {
    	 System.out.println("1st gear");
	
}
      @Test(priority = 2)
     public void secondGear() {
    	 System.out.println("2nd gear");
    	 
}
}