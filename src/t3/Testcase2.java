package t3;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.inject.name.Named;

public class Testcase2 {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private  TestcaseUtil1 tcu=new TestcaseUtil1();




	  @BeforeTest
	public void dylc(){
		driver= new FirefoxDriver();;
	//	driver= new ChromeDriver();
		baseUrl = "http://192.168.0.95:8080/dev/oa";//http://192.168.0.95:8080/dev/oa   //http://miracleoa.vicp.cc:8089/dev/oa
	    driver.manage().window().maximize();//
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl );
	}
	//txt附件测试
	   @Test
	  // @Named(value = "fffffff")

		public  void attachfiletest1(){
			try {
	//			assert tcu.loginerror(driver, "99999", "1",baseUrl).trim().equals("您输入的用户名或密码有误，请重新输入");
				new Util1().login(driver,"xzbyg");
				assert !tcu.qdlcfj(driver).equals("");

		//	assert "a".equals("a");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
