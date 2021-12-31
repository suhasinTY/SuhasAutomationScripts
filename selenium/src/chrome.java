import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="./selenium_starting/chromedriver.exe";
		System.setProperty(key,value);
		chromedriver driver=new ChromeDriver();

	}

}
