package sits;

import org.openqa.selenium.chrome.ChromeDriver;

public class sprnt3proj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mosta\\Desktop\\selenium folder\\chromedriver_win32\\chromedriver.exe");
		 
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://96.241.214.11:82");
		 driver.findElementByName("ctl00$ContentPlaceHolder1$txtLoginID").sendKeys("mostakim");
		 driver.findElementByName("ctl00$ContentPlaceHolder1$txtPassword").sendKeys("m123456789");
	     driver.findElementByName("ctl00$ContentPlaceHolder1$btnLogin").click();

}
}