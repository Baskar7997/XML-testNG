package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
    @Test(enabled = true)
	public void sslc() {
		System.out.println("10th");
	}
    @Test(dependsOnMethods ="sslc")
	public void hsc() {
		System.out.println("12th");
	}
    
    @Test(dependsOnMethods ="hsc")
	public void engg(){
		System.out.println("college");
	}
}

