package sits;

import org.openqa.selenium.chrome.ChromeDriver;

public class sprnt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mosta\\Desktop\\selenium folder\\chromedriver_win32\\chromedriver.exe");
		 
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://96.241.214.11:82");
		 driver.findElementByLinkText("New User? Register Here").click();
		 driver.findElementByName("ctl00$ContentPlaceHolder1$txtFirstName").sendKeys("mostakim");
		 driver.findElementByName("ctl00$ContentPlaceHolder1$txtLastName").sendKeys("morad");
		 driver.findElementByName("ctl00$ContentPlaceHolder1$txtAddr1").sendKeys("4613 pen lucy rd");
		 driver.findElementByName("ctl00$ContentPlaceHolder1$txtCity").sendKeys("baltimore");
		 driver.findElementByName("ctl00$ContentPlaceHolder1$txtState").sendKeys("md");
		 driver.findElementByName("ctl00$ContentPlaceHolder1$txtZipCode").sendKeys("21229");
         driver.findElementByName("ctl00$ContentPlaceHolder1$txtMobilePhone").sendKeys("3476940123");
         driver.findElementByName("ctl00$ContentPlaceHolder1$txtEmailID").sendKeys("mmostakimm@gmail.com");
         driver.findElementByName("ctl00$ContentPlaceHolder1$txtUserName").sendKeys("mostakimm");
 		driver.findElementByName("ctl00$ContentPlaceHolder1$txtPassword").sendKeys("m123456789");
 		driver.findElementByName("ctl00$ContentPlaceHolder1$txtConfirmPassword").sendKeys("m123456789");
 		driver.findElementByName("ctl00$ContentPlaceHolder1$btnSubmit").click();
 		//driver.findElementByLinkText("Submit").click();
         
         
	}

}
