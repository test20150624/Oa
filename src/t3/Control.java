package t3;

import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Control {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {


			new Control().ctl();
		//	new Control().ctqd();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ctl(){

		driver = new FirefoxDriver();//huohu
	//	driver= new ChromeDriver();
	    baseUrl = "http://192.168.0.95:8080/dev/oa";//http://192.168.0.95:8080/dev/oa   //http://miracleoa.vicp.cc:8089/dev/oa
	    driver.manage().window().maximize();//最大化
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl );
	    Util1 u=new Util1();
		try {
			u.login(driver,"xzbyg");//
			   Thread.currentThread().sleep(2000);
			u.qdlc(driver);//启动流程1
			/*   driver.get(baseUrl );
			    Thread.currentThread().sleep(3000);
			u.fwqc(driver);	//发文起草2
		    Thread.currentThread().sleep(2000);
			u.logout();
		    Thread.currentThread().sleep(2000);


			u.login(driver, "xzbjl");
			u.fwsg(driver);//发文审稿3a
			System.out.println("aaaaaaaaaaaa");
		   // Thread.currentThread().sleep(6000);
		    //////////////////ok
	 //	u.fwsg2(driver);//发文审稿3b
	 //   driver.get(baseUrl );
		    Thread.currentThread().sleep(4000);
			u.fwhg(driver);//发文核稿4
			System.out.println("abbbbbbbbbbb");
		    Thread.currentThread().sleep(3000);
			u.logout();
		    Thread.currentThread().sleep(2000);


			u.login(driver, "dsz");
			u.fwqfdsz(driver);  //5发文签发
		    Thread.currentThread().sleep(4000);
			u.logout();
		    Thread.currentThread().sleep(2000);
			u.login(driver,"xzbyg");
			u.fwcw(driver);//发文成文6
		    Thread.currentThread().sleep(4000);
			u.wjfs(driver);//文件发�?7
	System.out.println("****************");
	 Thread.currentThread().sleep(4000);
	driver.quit();//tuichu
	//driver.close();//关闭
*/			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 启动流程1
	 */
	public void ctqd(){

			driver = new FirefoxDriver();//huohu
		//driver= new ChromeDriver();
	    baseUrl = "file:///C:/Users/Administrator/Desktop/aaaa.html";//http://192.168.0.95:8080/dev/oa   //http://miracleoa.vicp.cc:8089/dev/oa
	    driver.manage().window().maximize();//�?���?
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl );
	    JavascriptExecutor j= (JavascriptExecutor)driver;
	    j.executeScript(" var va=document.getElementById('tas').setAtrribute='ssssssssssd';alert('v'+va); ")	    ;
	 //   System.out.println(driver.findElement(By.id("ext-gen323")).getAttribute("class"));;

	//	 String name =(String) ((JavascriptExecutor)driver).executeScript("return document.getElementById('submitButton').innerText ");
	 //   String name1=(String)	 j.executeScript(" var kk  = document.createElement('param');  var v=document.getElementById('EIOWebOffice').appendChild(kk);v.setAttribute('value','99990');v.setAttribute('name','tas');v.setAttribute('id','tas');alert(v)");
	//    String names=(String)	 j.executeScript(" document.getElementById('EIOWebOffice').ff('ddddw') ");



//	    String name2=(String)	 j.executeScript(" alert(v)");   ;
//	    System.out.println("nnnnnnnn@"+name1);
   //System.out.println(driver.findElement(By.id("ss")).getTagName());;
	//  Util1 u=new Util1();
		try {
			  /*		u.login(driver,"xzbyg");//
			u.qdlc(driver);//启动流程1
			   driver.get(baseUrl );
			    Thread.currentThread().sleep(4000);
			u.fwqc(driver);	//发文起草2
		    Thread.currentThread().sleep(4000);
			u.logout();
		    Thread.currentThread().sleep(2000);

		    driver.quit();//
		    driver.close();//关闭
*/
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
///office=document.getElementByid('eo')
//office.insertText();
}
