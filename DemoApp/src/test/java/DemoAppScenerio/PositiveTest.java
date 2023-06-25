package DemoAppScenerio;

import org.igt.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PositiveTest {

	@Test
	public class BeforeAfterAnnotaion {
		private static WebDriver driver;

		@BeforeMethod
		private void setup() {
			System.out.println("Starting Login Test");
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();

			sleep(3000);

			driver.manage().window().maximize();
		}

		public void LoginTest() {

//		open test page 
			String url = "https://sakshingp.github.io/assignment/login.html";
			driver.get(url);
			System.out.println("Page is Opened");

// 		Screem delay sleep for 3 sec
			sleep(2000);

// 		enter username
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("tomsmith");
			sleep(1000);

//		Enter Password
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("SuperSecretPassword!");
			sleep(1000);

//		Click login button 
			WebElement LogInButton = driver.findElement(By.className("btn btn-primary"));
			LogInButton.click();
			sleep(1000);

		}

		public void amount() {

			System.out.println("Starting Login Test");

//			create driver(Use Control Shift O to add all the Import Automatically )
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

//	 		Screem delay sleep for 3 sec
			sleep(3000);

//	 		Screen Maximise
			driver.manage().window().maximize();

//			open test page 
			String url = "https://sakshingp.github.io/assignment/login.html";
			driver.get(url);
			System.out.println("Page is Opened");

//	 		Screem delay sleep for 3 sec
			sleep(2000);

//	 		enter username
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("tomsmith");
			sleep(1000);

//			Enter Password
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("SuperSecretPassword!");
			sleep(1000);

//			Click login button 
			WebElement LogInButton = driver.findElement(By.className("btn btn-primary"));
			LogInButton.click();
			sleep(1000);

			WebElement clickAmount = driver.findElement(By.xpath("//th[@id='amount']"));
			clickAmount.click();

			WebElement CompleteStatus = driver.findElement(
					By.xpath("//table[@id='transactionsTable']/tbody/tr[1]/td[5]/span[@class='text-success']"));
			System.out.println(CompleteStatus);

		}
		
		@AfterMethod
		public static void tearDown() {
			Driver.quitDriver();
		}
		
		

		private void sleep(long m) {
			try {
				Thread.sleep(m);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}