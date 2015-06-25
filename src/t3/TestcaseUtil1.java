package t3;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestcaseUtil1 {
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
	 * 登陆错误用例
	 * @param driver1
	 * @param username
	 * @param pwd
	 * @return
	 * @throws InterruptedException
	 */

	public String loginerror(WebDriver driver1, String username, String pwd,String baseUrl)
			throws InterruptedException {

		driver = driver1;
		driver.get(baseUrl);

		Thread.currentThread().sleep(1000);
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys(username);// xzbyg lyq
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		// Thread.currentThread().sleep(6000);
/*		if (driver.findElement(By.cssSelector("div.content > p")) != null)
			System.out.print(driver.findElement(
					By.cssSelector("div.content > p")).getText()
					+ "****");*/

		return driver.findElement(By.cssSelector("div.content > p")).getText();

		// driver.quit();

	}
	/**
	 * 登陆正确用例
	 * @param driver1
	 * @param username
	 * @param pwd
	 * @return
	 * @throws InterruptedException
	 */
	public String loginok(WebDriver driver1, String username, String pwd)
			throws InterruptedException {
		driver = driver1;
		Thread.currentThread().sleep(1000);

		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys(username);// xzbyg lyq
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		Thread.currentThread().sleep(2000);
	//	System.out.print(driver.findElement(By.xpath("//div/ul/li")).getText()+"****");
		if (driver.findElement(By.xpath("//div/ul/li")).getText() != "")
			return driver.findElement(By.xpath("//div/ul/li")).getText();
		else
			return "";

	}
	/**
	 * 判断元素是否存在
	 * @param by
	 * @return
	 */
	protected boolean IsElementPresent(By by) {

        try {
            driver.findElement(by);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
	/**
	 * 启动工作流程firefox测试附件上传
	 */
	public String qdlcfj(WebDriver driver1){
		driver=driver1;
		qdlc1(driver);//启动流程前
		  new Util1().fj(driver);//附件测试
		   System.out.println("finishfj");
	//		System.out.println("qw"+driver.findElement(By.cssSelector("div.file_name")).getText());
		return driver.findElement(By.cssSelector("div.file_name")).getText();
	}
	public void qdlc1(WebDriver driver1){
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

	    driver.findElement(By.id("flddh")).clear();//手机�?
	    driver.findElement(By.id("flddh")).sendKeys("15022002062");

	    driver.findElement(By.xpath("//tr/td/span/a")).click();//By.linkText("选择")

	    driver.findElement(By.cssSelector("input[type=checkbox]")).click();
	    driver.findElement(By.id("ext-gen180")).click();//确定按钮
//-----------------------
	    driver.findElement(By.name("c4208931fd854f09a85498f7db8df0a0")).click();
	    driver.findElement(By.id("extdd-6")).click();//报告
	    driver.findElement(By.id("ext-gen227")).click();//确定
		//  new Util1().fj(driver);//附件测试
	/*	    driver.findElement(By.cssSelector("em.num_2")).click();//编辑正文
		   // driver.findElement(By.id("EIOWebOffice")).click();//激活
		    System.out.println("kkkkkkkkkkkkkkkkkkkkkkkk");
		    try {
				Thread.currentThread().sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   driver.findElement(By.id("ext-gen302")).click();//保存退出
*/
//	   driver.findElement(By.cssSelector("a.blue_btn > span")).click();//完成按钮


	}
	public String qdlcok(WebDriver driver1){

		return null;

	}

}
