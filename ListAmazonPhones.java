package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListAmazonPhones {

	public static void main(String[] args) {
		//call WDM for Chrome
				WebDriverManager.chromedriver().setup();
				
				//launch Chrome
				ChromeDriver driver = new ChromeDriver();
				
				//load the driver
				driver.get("https://www.amazon.in");
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
				
				//Type "phones" in the Search box
				WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
				findElement.sendKeys("phones");				
				findElement.sendKeys(Keys.ENTER);
				
				
				List<WebElement> findElements = driver.findElements(By.className("a-price-whole"));
				
				//Create a integer list to add all the phone price
				List<Integer> phonePrice = new ArrayList<Integer>();
				
				// Get price of every phone And Print
				for(int i=0 ; i <findElements.size(); i++) {
					WebElement phone = findElements.get(i);
					System.out.println(phone.getText());
					int parseInt = Integer.parseInt(phone.getText().replace(",", ""));
					phonePrice.add(parseInt);
				}
				
				Collections.sort(phonePrice);
				System.out.println("Minimum Phone Price "+phonePrice.get(0));
				
				
				
				
				
				
				
				
				

	}

}
