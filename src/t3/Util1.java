package t3;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import t3.Jietu;

public class Util1 {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * xzbyg
	 * @throws InterruptedException
	 */
	public void login(WebDriver driver1,String username) throws InterruptedException{

		/*driver = new FirefoxDriver();

	    baseUrl = "http://192.168.0.95:8080/dev/oa";//http://192.168.0.95:8080/dev/oa   //http://miracleoa.vicp.cc:8089/dev/oa

	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl );
*/
		driver=driver1;
	    Thread.currentThread().sleep(1000);
	//	driver.findElement(By.id("userName")).clear();
	//	Thread.currentThread().sleep(1000);
		driver.findElement(By.id("userName")).clear();
	    driver.findElement(By.id("userName")).sendKeys(username);//xzbyg    lyq
	    driver.findElement(By.id("password")).sendKeys("1");
	    driver.findElement(By.id("submitButton")).click();
	    Thread.currentThread().sleep(4000);

	   // driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	}
	public void logout(){
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("注销")).click();
	}
	/**
	 * 启动工作流程
	 */
	public String qdlc(WebDriver driver1){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		Calendar calendar = new GregorianCalendar();
		String cdt=sdf.format(calendar.getTime());
		String filename="test"+cdt;
		driver=driver1;
	   driver.findElement(By.xpath("//div/ul/li[2]/a/span")).click();//By.xpath("//div('ext-gen58')/ul/li[2]/a/span")
	   driver.findElement(By.xpath("//div/a[2]/span")).click();
	    driver.findElement(By.id("fldtm")).clear();
	    driver.findElement(By.id("fldtm")).sendKeys(filename);//文件名称"20150611001testa"
	    driver.findElement(By.name("27dec43a365e45d6ade3c6ccbc09742b")).click();
	    driver.findElement(By.id("fldztc")).clear();

	    driver.findElement(By.id("fldztc")).clear();
	    driver.findElement(By.id("fldztc")).sendKeys("2222222222222");

	    driver.findElement(By.id("flddh")).clear();//手机
	    driver.findElement(By.id("flddh")).sendKeys("15022002062");

	    driver.findElement(By.xpath("//tr/td/span/a")).click();//By.linkText("选择")

	    driver.findElement(By.cssSelector("input[type=checkbox]")).click();
	    driver.findElement(By.id("ext-gen180")).click();//确定按钮
//-----------------------
	    driver.findElement(By.name("c4208931fd854f09a85498f7db8df0a0")).click();


	    driver.findElement(By.id("extdd-6")).click();//报告
	    driver.findElement(By.id("ext-gen227")).click();//确定
		//    fj();//附件测//试
		    driver.findElement(By.cssSelector("em.num_2")).click();//编辑正文

		    System.out.println("kkkkkkkkkkkkkkkkkkkkkkkk");
		    try {
				Thread.currentThread().sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   JavascriptExecutor j= (JavascriptExecutor)driver;
			    j.executeScript(" var va=document.getElementById('EIOWebOffice'); va.insertText('fdddddddddddddddwwwwwww'); ");
			    try {
					Thread.currentThread().sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		   driver.findElement(By.id("ext-gen302")).click();//保存退出
		    System.out.println("finish");
	 //  driver.findElement(By.cssSelector("a.blue_btn > span")).click();//完成按钮
	   try {
			Thread.currentThread().sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	   driver.findElement(By.cssSelector("a.blue_btn > span")).click();//完成按钮
	   return filename;
	}
	/**
	 * 发文起草
	 */

	  public void fwqc(WebDriver driver1){
		  driver =driver1;
		   driver.findElement(By.xpath("//tbody[@id='module_待办事宜']/tr[1]/td/a/span")).click();//打开详情�?
		//	jietu(1);
		   driver.findElement(By.cssSelector("a.blue_btn > span")).click();//完成
		 //   driver.findElement(By.id("ext-gen158")).click();//确定
		  //  System.out.println( driver.findElement(By.cssSelector("em.x-btn-text")).getText());

	  }
	  /**
		 * xzbjl发文审搞1
		 */
	   public void fwsg(WebDriver driver1){
		   driver=driver1;
		   driver.findElement(By.cssSelector("a.linkScript > span")).click();//详情
		  // driver.findElement(By.linkText("20150610001test")).click();
		   driver.findElement(By.partialLinkText("同意！")).click();
		  driver.findElement(By.cssSelector("a.blue_btn > span")).click();//完成按钮
		    try {
				Thread.currentThread().sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   driver.findElement(By.id("ext-gen154")).click();//不会签
		//   driver.findElement( By.id("")).click();
		   jietu("5");

	   }
	   /**
		 * xzbjl发文审搞2
		 */
	   public void fwsg2(WebDriver driver1){
		   driver=driver1;
		   driver.findElement(By.cssSelector("a.linkScript > span")).click();//详情ye
		  // driver.findElement(By.linkText("20150610001test")).click();
		   driver.findElement(By.partialLinkText("同意！")).click();
		  driver.findElement(By.cssSelector("a.blue_btn > span")).click();//完成按钮
		   driver.findElement(By.id("ext-gen152")).click();//不会签

	   }
	   /**
		 * xzbjl发文核稿
		 */
	   public void fwhg(WebDriver driver1){
		   driver=driver1;
		   driver.findElement(By.cssSelector("a.linkScript > span")).click();//详情�?
		  // driver.findElement(By.linkText("20150610001test")).click();
		   driver.findElement(By.partialLinkText("同意！")).click();
		  driver.findElement(By.cssSelector("a.blue_btn > span")).click();//完成按钮
		//   driver.findElement(By.id("ext-gen152")).click();//不会签

	   }
	   /**
		 * dsz 发文签发
		 * @throws InterruptedException
		 */
	   public void fwqfdsz (WebDriver driver1){
		   driver=driver1;

		   driver.findElement(By.xpath("//tbody[@id='module_待办事宜']/tr[1]/td/a/span")).click();
			  driver.findElement(By.cssSelector("a.blue_btn > span")).click();//完成按钮
	   }

	   /**
		   *xzbyg 发文成文
		   */
		  public void fwcw(WebDriver driver1){
			  driver=driver1;
			   driver.findElement(By.xpath("//tbody[@id='module_待办事宜']/tr[1]/td/a/span")).click();//打开详情�?
			   driver.findElement(By.cssSelector("a.blue_btn > span")).click();//完成
			    driver.findElement(By.id("ext-gen158")).click();//确定
			  //  System.out.println( driver.findElement(By.cssSelector("em.x-btn-text")).getText());

		  }
		  /**
		   * xzbyg文件发送
		   */
		  public void wjfs(WebDriver driver1){
			  driver=driver1;
			   driver.findElement(By.xpath("//tbody[@id='module_待办事宜']/tr[1]/td/a/span")).click();//打开详情
			   driver.findElement(By.cssSelector("a.blue_btn > span")).click();//完成

		  }
		  /**
		   * 截图
		   * @param n
		   */
		  public void jietu(String n){

			    Jietu cam= new Jietu("D:\\"+n, "jpg");//截图

			    cam.snapShot();
			}
		  /***
		   * 启动流程附件测试
		   */
		  public void fj(WebDriver driver1){
			  driver=driver1;
			    driver.findElement(By.cssSelector("em.num_4")).click();
			    try {
			    Thread.currentThread().sleep(1000);
			    driver.findElement(By.id("ext-gen302")).click();//添加按钮203


					Runtime.getRuntime().exec("c:\\Users\\Administrator\\Desktop\\upload.exe");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 try {
					 Thread.currentThread().sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    driver.findElement(By.cssSelector("#ext-gen290")).click();//ext-gen218
			//	System.out.println("*****************8"+driver.findElement(By.cssSelector("div.x-tool x-tool-close")).getText());

			    System.out.println("1112");

			    /*	    WebElement adFileUpload=driver.findElement(By.id("ext-gen230"));
			    	String	StringfilePath="c:\\Users\\Administrator\\Desktop\\tf1.txt";
			    		 adFileUpload.sendKeys(StringfilePath);*/
			}

}
