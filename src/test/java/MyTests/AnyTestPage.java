
package MyTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Analyzer.MyTransformer;
import Base.BasePage;
import Listeners.CustomeListener;
@Listeners({CustomeListener.class,MyTransformer.class})
public class AnyTestPage extends BasePage {

	
	
	

	@BeforeMethod
	public void setUp() {
		initialization();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
//	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class, priority=1)
	@Test
	public void test1() {
		System.out.println("test1");
		Assert.assertEquals(true, false);
	}
	
	
//	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
	@Test
	public void test2() {
		System.out.println("Test2");
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test3() {
		System.out.println("Test3");
		Assert.assertEquals(true, false);
	}
	@Test
	public void test4() {
		System.out.println("Test4");
		Assert.assertEquals(true, false);
	}
	/*
	 * 
	 * adding no of lines
	 * adding no of lines
	 * adding no of lines
	 * adding no of lines
	 */
	
	
}
