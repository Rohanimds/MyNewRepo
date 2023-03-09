package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "dataProvider_Test")
	public void bookTicket(String src, String dst) {
		System.out.println("Book Ticket from " + src + " to " + dst);
	}

	@DataProvider
	public Object dataProvider_Test() {
		Object[][] objArr = new Object[5][2];
		objArr[0][0] = "Banglore";
		objArr[0][1] = "Goa";

		objArr[1][0] = "Banglore";
		objArr[1][1] = "Mysore";

		objArr[2][0] = "Banglore";
		objArr[2][1] = "Mangalore";

		objArr[3][0] = "Banglore";
		objArr[3][1] = "Mumbai";

		objArr[4][0] = "Banglore";
		objArr[4][1] = "Kerala";

		return objArr;

	}
}
