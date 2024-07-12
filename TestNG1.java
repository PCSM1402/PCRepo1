package javaPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	
	public void a1() {
		
		System.out.println("Hi A1");
	}
 @Test
 
 public void b() {
	 System.out.println("Hello B");
 }
 
 @BeforeSuite
 
 public void bs() {
	 
	 System.out.println("Before Suite 1");
 }
 
 @BeforeTest
 
 public void bt() {
	 
	 System.out.println("Before Test 1");
 }
 
 @AfterTest
 
 public void at() {
	 
	 System.out.println("After Test 1");
 }
}
