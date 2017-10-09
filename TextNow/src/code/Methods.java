package code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	public WebDriver driver;
	public void setupff()
	{
		System.setProperty("webdriver.gecko.driver", Constants.geckopath);
		driver=new FirefoxDriver();
		driver.get(Constants.url);	
	}
	public void login()

	{
		WebElement uname =driver.findElement(By.id(Constants.uname_id));
		uname.sendKeys(Constants.uname_val);
		WebElement pass =driver.findElement(By.id(Constants.pass_id));
		pass.sendKeys(Constants.pass_val);
		WebElement login =driver.findElement(By.id(Constants.login_id));
		login.click();
	}
	public void closeff()
	{
		driver.close();
		
	}
}
