package t3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Testcase4 {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private  TestcaseUtil1 tcu=new TestcaseUtil1();
	  private Util1 u=new Util1();
	  private Util2 u2=new Util2();
	  private static String filename="99999";

	  @BeforeTest
		public void start1(){
		//  	driver= new FirefoxDriver();;
			driver= new ChromeDriver();
			baseUrl = "http://192.168.0.95:8080/dev/oa";//http://192.168.0.95:8080/dev/oa   //http://miracleoa.vicp.cc:8089/dev/oa
		    driver.manage().window().maximize();//
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.get(baseUrl );
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Testcase4 t4=new Testcase4();
			t4.start1();
		//	t4.fwdel();
			t4.fwdel();
	//	t4.jstest();
		//	t4.fwjbxxpage();
		/*	String f="[公司发文] test20150617103958";
			System.out.println(f.substring(7).trim());*/
		}

		/**
		 * 首页测试
		 * @author Administrator
		 *
		 */
		@Test
		 public  void hpageok(){
			  try {


					u.login(driver,"xzbyg");

					assert u2.homepage(driver,"test20150617113706").equals("ok");
					Thread.currentThread().sleep(2000);
					u.logout();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		/**
		 * 浏览器类型
		 */
		 public  String  browerstest(){
				String name="Chrome";
				try {
	/*			//	u.login(driver,"xzbyg");
					JavascriptExecutor j= (JavascriptExecutor)driver;
				 String name =(String) ((JavascriptExecutor)driver).executeScript("return document.getElementById('submitButton').innerText ");//;alert(v);
*/
					String js=" if(isFirefox=navigator.userAgent.indexOf(\"Firefox\")>0){      return \"Firefox\"     } " +
					"if(isFirefox=navigator.userAgent.indexOf(\"Chrome\")>0){      return \"Chrome\"     } ";
	name =(String) ((JavascriptExecutor)driver).executeScript(js);
	;
						      System.out.println("start...javascript"+name);
						      TimeUnit.SECONDS.sleep(3);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return name;
		 }
		 /**
		  * 发文管理删除
		  */
		  @Test
		 public void fwdel(){
			 try {
				u.login(driver,"xzbyg");

			//	 new TestcaseUtil1().qdlc1(driver);//启动基本信息页
				u2.fwgld(driver,"test20150619134036");
				System.out.println("************");
				Thread.currentThread().sleep(2000);
				u.logout();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		 }
		 /**
		  * 发文查询
		  */
		 public void fwcx(){
			 try {
					u.login(driver,"xzbyg");
					Thread.currentThread().sleep(2000);
				//	 new TestcaseUtil1().qdlc1(driver);//启动基本信息页
					u2.fwgcx(driver,"test20150617105005");
					System.out.println("************");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }

		 /**
		  * 分页
		  */

		 public void fpgl(){
			 try {
				u.login(driver,"xzbyg");

			//	 new TestcaseUtil1().qdlc1(driver);//启动基本信息页
				u2.fpg1(driver,"test20150617172649");
				System.out.println("************");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		 }

}
