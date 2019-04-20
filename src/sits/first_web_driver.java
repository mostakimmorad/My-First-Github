package sits;

import org.openqa.selenium.chrome.ChromeDriver;

public class first_web_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\mosta\\Desktop\\selenium folder\\chromedriver_win32\\chromedriver.exe");
	
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
	driver.findElementByLinkText("Gmail").click();
	

	
	driver.findElementByLinkText("Create an account").click();
	
	driver.findElementById("firstName").sendKeys("mostakim");
	
	driver.findElementById("lastName").sendKeys("morad");
	
	driver.findElementByName("Username").sendKeys("mm1234");
	
	driver.findElementByName("Passwd").sendKeys("abcd1234");
	
	driver.findElementByName("ConfirmPasswd").sendKeys("abcd1234");
	
	
	
	
	
	
	}
	
}
