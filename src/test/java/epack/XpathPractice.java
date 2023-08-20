package epack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractice {
	
private static WebDriver driver;
public static void main(Strings[] args ) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/");


	


}
}