package Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BasePage {


	public static WebDriver driver;
	
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\DOCUMENTS\\SELENIUM JAR FILE AND CHORME DRI\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
//		driver.manage().window().maximize();
	}
	
	public void failed(String methodName) {
			
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
//				FileHandler.copy(srcFile, new File("C:\\Users\\sachin\\Downloads\\Secoinn\\ScreenShots\\fail.jpg"));
				try {
					FileUtils.copyFile(scrFile, new File("C:\\Users\\sachin\\Downloads\\RetryLogic\\ScreenShots\\"+methodName+".jpg" ));
				} catch (IOException e) {
					e.printStackTrace();
				}
//				System.out.println(this.getClass());
				
	
				System.out.println("Adding by another");
				System.out.println("Adding by another");
				
				System.out.println("Adding by another");
				
				System.out.println("Adding by another");
				System.out.println("Adding by another");
				
				
				
				
				
	}
	
}
