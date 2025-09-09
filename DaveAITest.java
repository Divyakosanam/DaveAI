package Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DaveAITest extends BaseClass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaveAITest obj = new DaveAITest();
		obj.runTest();
	}
	public void runTest() {
		setUp();
		
		//opening the Website link
		
		d.get("https://www.iamdave.ai/");
		
		//checking website loads successfully and displays the expected title or logo.
		
		String URL = d.getCurrentUrl();
		System.out.println("Current page URL : " +URL);
		
		if(URL.contains("https://www.iamdave.ai/"))
			System.out.println("Page loaded");
		else
			System.out.println("Page not loaded");
		
		System.out.println("Title of Page : " + d.getTitle());
		
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='attachment-full size-full wp-image-993236'])[1]")));
		
		if(logo.isDisplayed()) {
			System.out.println("Logo displayed");
		}
		else {
			System.out.println("Logo not displayed");
		}
		
		
		//Test a navigation flow
		WebElement b= d.findElement(By.xpath("(//a[contains(@class, 'elementor-button')])[1]"));
		b.click();
		System.out.println("Button clicked");
		
		//Test a form submission or input field interaction if available.
		
		
		WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id = 'form-field-name_free_audit']")));
		name.sendKeys("Divya");
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
		email.sendKeys("abc@gmail.com");
		WebElement com = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form-field-field_93bc8cc")));
		com.sendKeys("Dave.AI");
		
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='form-field-field_21d99c4']")));
		Select s = new Select (dropdown);
		s.selectByVisibleText("AI Chatbot");
		
		WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='tel']")));
		phone.sendKeys("1234567890");
		
		WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		submit.click();
		
			
		tearDown();
		
		

	}
}


