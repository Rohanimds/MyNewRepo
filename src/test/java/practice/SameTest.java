package practice;

import org.testng.annotations.Test;


public class SameTest {

	@Test(invocationCount = 2)
	    public void createCustomer() {
			System.out.println("Created");

		}

		@Test(dependsOnMethods = "createCustomer")
		public void modifyCustomer() {
			System.out.println("Modified");
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[5]);
		}

		@Test(dependsOnMethods = "createCustomer")
		public void deleteCustomer() {
			System.out.println("Deleted");
		}
	
}
