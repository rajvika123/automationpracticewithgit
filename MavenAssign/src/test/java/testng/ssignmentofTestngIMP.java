package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.SeleniumUtility;
public class ssignmentofTestngIMP extends SeleniumUtility {

	WebDriver driver ;
	@BeforeTest
	public void openBrowser1() {
		driver=setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("************Login with valid data***********************");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("************Logout from the application***********************");
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("************Close the browser instance***********************");
	}

	@Test
	public void test_OrangeHRM_PIM_Creation() {
		System.out.println("Write a code to create PIM");
	}

	@Test
	public void test_OrangeHRM_PIM_Update() {
		System.out.println("Write a code to update PIM");
	}
	
	@Test
	public void test_OrangeHRM_PIM_Delete() {
		System.out.println("Write a code to delete PIM");
	}

	@BeforeTest
	public void openBrowser() {
		System.out.println("************Open browser and enter OrangeHRM URL***********************");
	}

}
