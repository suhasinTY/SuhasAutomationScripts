package ELF29;


		import java.util.Set;
		import java.util.concurrent.TimeUnit;

		import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Dimension;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class urbanLader2 {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				String acutalHomePageTitle = "Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder";
				String actualCartTitle="Shopping Cart - Urban Ladder";
				driver.get("https://www.urbanladder.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				String expectedHomePageTitle = driver.getTitle();

				Actions action=new Actions(driver);
				driver.findElement(By.id("search")).sendKeys("study table",Keys.ENTER);
				driver.findElement(By.partialLinkText("Close")).click();
				String parentWindow = driver.getWindowHandle();
				WebElement price = driver.findElement(By.xpath("//div[contains(text(),'Price')]"));
				action.moveToElement(price).perform();
				Thread.sleep(2000);

				WebElement slidermin = driver.findElement(By.xpath(" //div[@class='noUi-handle noUi-handle-lower']"));
				action.dragAndDropBy(slidermin,48,0).perform();
				WebElement sliderMax = driver.findElement(By.xpath("//div[@class='noUi-handle noUi-handle-upper']"));
				action.dragAndDropBy(sliderMax,-180,0).perform();

				Thread.sleep(5000);
				WebElement product = driver.findElement(By.xpath("//ul[@class='productlist small-block-grid-3']//li[4]"));
				System.out.println(product.getText());
				product.click();

				Set<String> allWindow = driver.getWindowHandles();
				allWindow.remove(parentWindow);
				for (String window : allWindow) {
					driver.switchTo().window(window);
				}

				WebElement productDetails = driver.findElement(By.xpath("(//div[@class='row clearfix productinfodetails'])[1]"));
				System.out.println(productDetails.getText());

				WebElement warrenty = driver.findElement(By.xpath(" //div[@class='warranty-details']"));
				System.out.println(warrenty.getText());

				driver.findElement(By.xpath("(//button[contains(text(),'Add to Cart')])[1]")).click();
				String expectedCartTitle = driver.getTitle();

		}

	}


