package t3;


import t3.Jietu;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util2 {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
/**
 * 验证流程测试截图
 * @param driver1
 * @param filename1
 */
	public void fwgl(WebDriver driver1,String filename1){//发文管理
		String filename=filename1;
		driver=driver1;
	    driver.findElement(By.cssSelector("em.x-btn-arrow")).click();

/*	    driver.findElement(By.id("ext-gen124")).click();
	    driver.findElement(By.id("ext-comp-1102")).clear();
	    driver.findElement(By.id("ext-comp-1102")).sendKeys("测试");
	    driver.findElement(By.id("ext-gen218")).click();*/
	    driver.findElement(By.id("ext-gen108")).click();
	    driver.findElement(By.id("ext-comp-1069")).clear();
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
/*	    driver.findElement(By.id("ext-comp-1069")).sendKeys(filename.trim());//查询框
	    driver.findElement(By.id("ext-gen200")).click();//确定
*/	//    System.out.println(driver.findElement(By.xpath("//tbody[@id='module_待办事宜']/tr[1]/td/a/span")).getText());
	    List<WebElement> tabs = driver.findElements(By.cssSelector("div.x-grid3-row-expander"));//打开加号//("test20150617134943"));

	    int p=0;

	    List<WebElement> ts = driver.findElements(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[5]/div/div/a"));//获取文件名
		   // System.out.println(ts.get(0).getText());
		    for(int i=0;i<ts.size();i++){
		    	if(ts.get(i).getText().trim().equals(filename)){
		    		System.out.println("qqqqqqqq"+i);
		    		p=i;
		    	}
		    }
		    tabs.get(p).click();
	    try {
			Thread.currentThread().sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	new Util1().jietu(filename+"流程测试截图");//截图

   //     System.out.println(tabs.size());  //打印出button的个数


	}
	/**
	 * 发文起草,验证启动流程ok
	 */

	  public String qdok(WebDriver driver1,String filename){
		  driver =driver1;
		  WebElement  x1= driver.findElement(By.xpath("//tbody[@id='module_待办事宜']/tr[1]/td/a/span"));//打开详情�?
		  System.out.println(x1.getText().substring(7).trim());
		  if(x1.getText().substring(7).trim().equals(filename)){
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

		   	  return "ok";
		  }else{
			  return "false";
		  }
	//	  return "";
	  }
	  /**
	   * 发文审稿ok
	   *
	   */
	  public String fwsgok(WebDriver driver1,String filename){
		  WebElement  x1= driver.findElement(By.xpath("//tbody[@id='待办事宜']/tr[1]/td/a/span"));
		//  WebElement  x1=driver.findElement(By.cssSelector("a.linkScript > span"));
		  System.out.println("*("+x1.getText().substring(7).trim());
		  if(x1.getText().substring(7).trim().equals(filename)){



		   	  return "ok";
		  }else{
			  return "false";
		  }

	  }
	  public void testts(WebDriver driver1,String filename1){//---
			String filename=filename1;
			driver=driver1;
		    driver.findElement(By.cssSelector("em.x-btn-arrow")).click();
		    driver.findElement(By.id("ext-gen108")).click();
		    driver.findElement(By.id("ext-comp-1069")).clear();


	/*	    JavascriptExecutor j= (JavascriptExecutor)driver;
		    j.executeScript("document.findElementById('123').click() ");*/
		//   String name =(String) ((JavascriptExecutor)driver).executeScript("return document.getElementById('ext-gen333').innerText ");//;alert(v);
		//      System.out.println("start...javascript"+name);
			try {
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		    List<WebElement> tabs = driver.findElements(By.cssSelector("div.x-grid3-row-expander"));//打开加号//("test20150617134943"));


/*		    List<WebElement> ts = driver.findElements(By.cssSelector("table.x-grid3-row-table"));
		    System.out.println(ts.get(0).getText());*/

		 //   List<WebElement> ts = driver.findElements(By.cssSelector("table.x-grid3-row-table > tbody > tr "));
		    int p=0;
		    List<WebElement> ts = driver.findElements(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[5]/div/div/a"));
		   // System.out.println(ts.get(0).getText());
		    for(int i=0;i<ts.size();i++){
		    	if(ts.get(i).getText().trim().equals("test20150617172649")){
		    		System.out.println("qqqqqqqq"+i);
		    		p=i;
		    	}
		    }
		    tabs.get(p).click();
		//    List<WebElement> t = driver.findElements(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[6]"));
	//	   System.out.println(t.get(0).getAttribute("class"));

		   WebElement statue1= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[6]/table/tbody/tr/td[2]"));
		   System.out.println(statue1.getText());
		   System.out.println("jieshu");
		    try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		   /* for(WebElement t:tabs)
		    {    System.out.println(t);
		    	t.click();
		    }*/



		}
	  /**
	   * 首页元素测试
	   */
	  public String homepage(WebDriver driver1,String filename1){//---
			String filename=filename1;
			driver=driver1;


/*			System.out.println(driver.findElement(By.id("ext-gen60")).getText());//我的工作
			System.out.println(driver.findElement(By.id("ext-gen67")).getText());//委托待办
			System.out.println(driver.findElement(By.id("ext-gen29")).getText());//主页
			System.out.println(driver.findElement(By.id("ext-gen33")).getText());//公文管理
			System.out.println(driver.findElement(By.id("drag_1_h")).getText());//待办事宜
			System.out.println(driver.findElement(By.id("drag_2_h")).getText());//待阅文件
			System.out.println(driver.findElement(By.id("drag_3_h")).getText());//被催工作
			System.out.println(driver.findElement(By.id("drag_4_h")).getText());//意见跟踪
				//	    driver.findElement(By.id("ext-gen66")).click();//委托待办
	//	    driver.findElement(By.xpath("//div[@id='ext-gen65']/ul/li/a/span")).click(); // 委托工作
	//	    driver.findElement(By.xpath("//div[@id='ext-gen65']/ul/li[2]/a/span")).click(); //待办工作
	//  driver.findElement(By.id("ext-gen73")).click();//个人设置
	//	driver.findElement(By.xpath("//div[@id='ext-gen72']/ul/li[2]/a/span")).click();//皮肤设置
*/


			//不要删
			//在ie下使用innerText 在火狐下使用textContent
		//	System.out.println(driver.findElement(By.xpath("//div[@id='ext-gen65']/ul/li/p")).getAttribute("innerText"));//委托工作
		//	System.out.println(driver.findElement(By.xpath("//div[@id='ext-gen65']/ul/li/a/span")).getAttribute("style"));

		//    driver.findElement(By.cssSelector("#ext-gen583 > ul.oa_left_menu > li > a.m-02-bg-按钮背景图75x74-cur > span.icon")).click();

			if(driver.findElement(By.id("ext-gen29")).getText().trim().equals("主页")
					&&driver.findElement(By.id("ext-gen60")).getText().trim().equals("我的工作")){
				if(driver.findElement(By.id("drag_1_h")).getText().trim().equals("待办事宜")
					&&driver.findElement(By.id("drag_2_h")).getText().trim().equals("待阅文件")
						&&driver.findElement(By.id("drag_3_h")).getText().trim().equals("被催工作")
							&&driver.findElement(By.id("drag_4_h")).getText().trim().equals("意见跟踪")){
				//	System.out.println("1111111111111");
					return "ok";


				}
			}

			return "error";

		}
	  /**
	   * 打开+
	   */
	  public int openj(WebDriver driver1,String filename1){
			String filename=filename1;
			driver=driver1;
		    driver.findElement(By.cssSelector("em.x-btn-arrow")).click();
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    driver.findElement(By.id("ext-gen108")).click();
		    try {
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		    List<WebElement> tabs = driver.findElements(By.cssSelector("div.x-grid3-row-expander"));//打开加号
		    int p=0;
		    List<WebElement> ts = driver.findElements(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[5]/div/div/a"));
		   // System.out.println(ts.get(0).getText());
		    for(int i=0;i<ts.size();i++){
		    	if(ts.get(i).getText().trim().equals(filename)){
		    		System.out.println("qqqqqqqq"+i);
		    		p=i;
		    	}
		    }
		    tabs.get(p).click();
		    return p;
	  }
	  /**
	   * 流程1验证
	   * @return
	   */
	  public String flow1(WebDriver driver1,String filename1){
			String filename=filename1;

		  driver=driver1;
		  WebElement statue1= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]/table/tbody/tr/td[1]"));
		  WebElement statue2= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]/table/tbody/tr/td[2]"));
		  WebElement statue8= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]/table/tbody/tr/td[8]"));
		  System.out.println(statue8.getText());
		   if(statue1.getText().equals("1")&&statue2.getText().trim().equals("发文起草")){
			   System.out.println("1发文起草===");
			   if(!statue8.getText().trim().equals("")){
				   System.out.println("statu8 不为空");
				   return "ok";
				   		   }
		   }


		   System.out.println("流程判断end");
		return "";

	  }
	  /**
	   * 流程2验证
	   * @return
	   */
	  public String flow2(WebDriver driver1,String filename1){
		  String filename=filename1;

		  driver=driver1;
		  //序号
		  WebElement statue1= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/table/tbody/tr/td[1]"));
		 //状态
		  WebElement statue2= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/table/tbody/tr/td[2]"));
		 //完成时间
		  WebElement statue8= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/table/tbody/tr/td[8]"));
		  System.out.println(statue8.getText());
		   if(statue1.getText().equals("2")&&statue2.getText().trim().equals("发文审稿")){
			   System.out.println("2发文审稿===");
			   if(!statue8.getText().trim().equals("")){
				   System.out.println("statu8 不为空");
				   return "ok";
				   		   }
		   }


		   System.out.println("流程判断end");
			return "";
	  }
	  /**
	   * 流程3验证
	   * @return
	   */
	  public String flow3(WebDriver driver1,String filename1){
		  String filename=filename1;

		  driver=driver1;
		  WebElement statue1= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[3]/table/tbody/tr/td[1]"));
		  WebElement statue2= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[3]/table/tbody/tr/td[2]"));
		  WebElement statue8= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[3]/table/tbody/tr/td[8]"));
		  System.out.println(statue8.getText());
		   if(statue1.getText().equals("3")&&statue2.getText().trim().equals("发文核稿")){
			   System.out.println("3发文核稿===");
			   if(!statue8.getText().trim().equals("")){
				   System.out.println(" 不为空");
				   return "ok";
				   		   }
		   }


		   System.out.println("流程判断end");
			return "";
	  }
	  /**
	   * 流程4验证
	   * @return
	   */
	  public String flow4(WebDriver driver1,String filename1){
		  String filename=filename1;

		  driver=driver1;
		  WebElement statue1= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/table/tbody/tr/td[1]"));
		  WebElement statue2= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/table/tbody/tr/td[2]"));
		  WebElement statue8= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/table/tbody/tr/td[8]"));
		  System.out.println(statue8.getText());
		   if(statue1.getText().equals("4")&&statue2.getText().trim().equals("发文签发")){
			   System.out.println("4发文签发===");
			   if(!statue8.getText().trim().equals("")){
				   System.out.println(" 不为空");
				   return "ok";
				   		   }
		   }


		   System.out.println("流程判断end");
			return "";
	  }
	  /**
	   * 流程5验证
	   * @return
	   */
	  public String flow5(WebDriver driver1,String filename1){
		  String filename=filename1;

		  driver=driver1;
		  WebElement statue1= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[5]/table/tbody/tr/td[1]"));
		  WebElement statue2= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[5]/table/tbody/tr/td[2]"));
		  WebElement statue8= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[5]/table/tbody/tr/td[8]"));
		  System.out.println(statue8.getText());
		   if(statue1.getText().equals("5")&&statue2.getText().trim().equals("发文成文")){
			   System.out.println("5发文成文===");
			   if(!statue8.getText().trim().equals("")){
				   System.out.println(" 不为空");
				   return "ok";
				   		   }
		   }


		   System.out.println("流程判断end");
			return "";
	  }
	  /**
	   * 流程6验证
	   * @return
	   */
	  public String flow6(WebDriver driver1,String filename1){
		  String filename=filename1;

		  driver=driver1;
		  WebElement statue1= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[6]/table/tbody/tr/td[1]"));
		  WebElement statue2= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[6]/table/tbody/tr/td[2]"));
		  WebElement statue8= driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[2]/td/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[6]/table/tbody/tr/td[8]"));
		  System.out.println(statue8.getText());
		   if(statue1.getText().equals("6")&&statue2.getText().trim().equals("文件发送")){
			   System.out.println("6发文签发===");
			   if(!statue8.getText().trim().equals("")){
				   System.out.println(" 不为空");
				   return "ok";
				   		   }
		   }


		   System.out.println("流程判断end");
			return "";
	  }
	  /**
	   * 发文管理删除
	   *
	   */

		public void fwgld(WebDriver driver1,String filename1){//发文管理
			 driver=driver1;
			  String filename=filename1;
		  int a=  openj(driver,filename);
		  List<WebElement> checks=driver.findElements(By.cssSelector("div.x-grid3-row-checker"));
		    System.out.println(checks.size());
		    	checks.get(a).click();//勾选所需要删除的发文
		    	driver.findElement(By.id("ext-gen195")).click();//删除按钮
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	//			driver.findElement(By.id("ext-gen267")).click();//删除提示点是
	//			driver.findElement(By.id("ext-gen269")).click();//删除提示点否



		}
		/**
		 *
		 * 发文查询
		 */
		public void fwgcx(WebDriver driver1,String filename1){//发文管理
			 driver=driver1;
			  String filename=filename1;
		    driver.findElement(By.cssSelector("em.x-btn-arrow")).click();
	/*	    driver.findElement(By.id("ext-gen124")).click();
		    driver.findElement(By.id("ext-comp-1102")).clear();
		    driver.findElement(By.id("ext-comp-1102")).sendKeys("测试");
		    driver.findElement(By.id("ext-gen218")).click();*/
		    driver.findElement(By.id("ext-gen108")).click();
		    driver.findElement(By.id("ext-comp-1069")).clear();
			try {
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    driver.findElement(By.id("ext-comp-1069")).sendKeys("test20150611131655");
		    driver.findElement(By.id("ext-gen200")).click();
		    driver.findElement(By.linkText("test20150611131655")).click();//打开详情页
		    WebElement wet=driver.findElement(By.id("ext-gen200"));
		    System.out.println(wet.getText());
		}
		  /**
		   * 分页
		   *
		   */

			public void fpg1(WebDriver driver1,String filename1){//发文管理
				 driver=driver1;
				  String filename=filename1;
			  int a=  openj(driver,filename);
			  List<WebElement> checks=driver.findElements(By.cssSelector("div.x-grid3-row-checker"));
			    System.out.println(checks.size());
			   // 	checks.get(a).click();//勾选所需要删除的发文

					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}




			}
}
