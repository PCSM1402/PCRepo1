package javaPackage;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestNG2 {

	@Test 
	
	public void z() {
		
		AssertJUnit.assertTrue(2>1);
		System.out.println("hello z test case");
	}
	
@Test (dependsOnMethods = "b")
	
	public void c() {
		
		System.out.println("hello c test case");
	}
	
     @Test (dependsOnMethods = "z")
	
	public void b() {
		
    	 AssertJUnit.assertTrue(2>10);
		System.out.println("hello b test case");
	}


	
}
