package t3;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.inject.name.Named;

/**
 * 登陆测试案例
 * @author Administrator
 *
 */
public class Testcase1 {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private  TestcaseUtil1 tcu=new TestcaseUtil1();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	new Control().ctqd();
	}
	@BeforeMethod
	public void fff(){

	}
	@BeforeTest
	public void dylc(){
		driver= new ChromeDriver();
	    baseUrl = "http://192.168.0.95:8080/dev/oa";//http://192.168.0.95:8080/dev/oa   //http://miracleoa.vicp.cc:8089/dev/oa
	    driver.manage().window().maximize();//�?���?
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl );
	}

	//密码为空
   @Test
   //@Named(value="密码为空")
	public void logintest1(){

		try {
			assert tcu.loginerror(driver, "xzbyg", "",baseUrl).equals("请输入用户名及密码");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 //用户名密码都为空
   @Test
	public void logintest2(){
		//assert "aa".equals("bb");
		try {
		//	System.out.println( tcu.loginok(driver, "xzbyg", "1").contains("您好")+"&&&&&&&");
			assert tcu.loginerror(driver, "", "",baseUrl).equals("请输入用户名及密码");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//用户名为�?
   @Test
	public void logintest3(){

		try {
			assert tcu.loginerror(driver, "", "1",baseUrl).equals("请输入用户名及密码");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//正确用户名，错误密码
   @Test
	public void logintest4(){

		try {
			assert tcu.loginerror(driver, "xzbyg", "",baseUrl).equals("请输入用户名及密码");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//正确密码，错误用户名
   @Test
	public  void logintest5(){
		try {
			assert tcu.loginerror(driver, "99999", "1",baseUrl).trim().equals("您输入的用户名或密码有误，请重新输入");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//用户名密码都为正确
	   @Test
/**
 * 测试正确
 */
		public void logintest6(){
			//assert "aa".equals("bb");
			try {
			//	System.out.println( tcu.loginok(driver, "xzbyg", "1").contains("您好")+"&&&&&&&");
				assert tcu.loginok(driver, "xzbyg", "1").contains("您好");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}




}
