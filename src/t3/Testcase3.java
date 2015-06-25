package t3;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/**
 * 流程测试验证
 * @author Administrator
 *
 */
public class Testcase3 {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private  TestcaseUtil1 tcu=new TestcaseUtil1();
	  private Util1 u=new Util1();
	  private Util2 u2=new Util2();
	  private static String filename="99999";
	  @BeforeTest
		public void dylc(){
		driver= new FirefoxDriver();;
		//		driver= new ChromeDriver();
			baseUrl = "http://192.168.0.95:8080/dev/oa";//http://192.168.0.95:8080/dev/oa   //http://miracleoa.vicp.cc:8089/dev/oa
		    driver.manage().window().maximize();//
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.get(baseUrl );
		}
	  /**
	   * 流程状态测试
	   */

	  public void flowok(int n,String filename1) {
		  //String filename="test20150617172649";//"test20150617104237";   //test20150617172649
		  String filename=filename1;
		  try {

				u.login(driver,"xzbyg");
			//assert u2.qdok(driver,"test20150617110231").equals("ok");
				Thread.currentThread().sleep(1000);
				u2.openj(driver, filename);
		//	System.out.println("pd"+	u2.flow6(driver, filename));
				if(n==1){
					System.out.println("pd1");
					assert u2.flow1(driver, filename).equals("ok");
				}else if(n==2){
					System.out.println("pd2");
					assert u2.flow2(driver, filename).equals("ok");
				}else if(n==3){
					System.out.println("pd3");
					assert u2.flow3(driver, filename).equals("ok");
				}else if(n==4){
					System.out.println("pd4");
					assert u2.flow4(driver, filename).equals("ok");
				}else if(n==5){
					System.out.println("pd5");
					assert u2.flow5(driver, filename).equals("ok");
				}else if(n==6){
					System.out.println("pd6");
					assert u2.flow6(driver, filename).equals("ok");
				}else {
					System.out.println("pde7");

					assert u2.flow1(driver, filename).equals("ok")
					&& u2.flow2(driver, filename).equals("ok")
					&& u2.flow3(driver, filename).equals("ok")
					&& u2.flow4(driver, filename).equals("ok")
					&& u2.flow5(driver, filename).equals("ok")
					&& u2.flow6(driver, filename).equals("ok");
				}
				Thread.currentThread().sleep(1000);
				u.logout();
				Thread.currentThread().sleep(2000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//
			   //ssThread.currentThread().sleep(2000);
	  }

/**
 * 流程截图
 */
	 //   @Test
	  public void lcjietu(String filename) {
		  try {


				u.login(driver,"xzbyg");
				u2.fwgl(driver,filename);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//


	  }
	  public  void ffs(){
		  try {


				u.login(driver,"xzbyg");
				u2.testts(driver,"test20150617113706");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Testcase3 t3=new Testcase3();

			t3.dylc();
			t3.zlctest();
			//	t3.ffs();//测试流程状态验证
		//	t3.flowok(2,"");
		/*	String f="[公司发文] test20150617103958";
			System.out.println(f.substring(7).trim());*/
		}
		/**
		 * 流程1
		 */

		public void fwqcok(){
			try {
				u.login(driver,"xzbyg");
				   Thread.currentThread().sleep(2000);
					u.qdlc(driver);//启动流程1
					   driver.get(baseUrl );
					    Thread.currentThread().sleep(3000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				System.out.println("启动流程失败");//


			}//
			try {
			    Thread.currentThread().sleep(2000);
				u.fwqc(driver);	//发文起草2
			    Thread.currentThread().sleep(2000);
				u.logout();

			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			}//


		}
		/**
		 * 流程2
		 */

		public void fwsgok(){

			try {
				Thread.currentThread().sleep(2000);
				u.login(driver, "xzbjl");
				u.fwsg(driver);//发文审稿3a
				System.out.println("aaaaaaaaaaaa");
				Thread.currentThread().sleep(2000);
				u.logout();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		/**
		 * 流程3
		 */

		public void fwhgok(){
			  try {
					Thread.currentThread().sleep(2000);
					u.login(driver, "xzbjl");
					Thread.currentThread().sleep(2000);
					u.fwhg(driver);//发文核稿4
					System.out.println("abbbbbbbbbbb");
				    Thread.currentThread().sleep(3000);
					u.logout();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


		}
		/**
		 * 流程4
		 */

		public void fwqfok(){
			try {
			    Thread.currentThread().sleep(2000);
				u.login(driver, "dsz");
				Thread.currentThread().sleep(1000);
				u.fwqfdsz(driver);  //5发文签发
			    Thread.currentThread().sleep(4000);
				u.logout();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
		/**
		 * 流程5
		 */
	//	@Test
		public void fwcwok(){

			try {
				Thread.currentThread().sleep(2000);
				u.login(driver,"xzbyg");
				Thread.currentThread().sleep(1000);
				u.fwcw(driver);//发文成文6
			    Thread.currentThread().sleep(4000);
			    u.logout();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		/**
		 * 流程6
		 */

		public void wjfsok(String filename){

			 try {
					Thread.currentThread().sleep(2000);
					u.login(driver,"xzbyg");
					Thread.currentThread().sleep(1000);
					u.wjfs(driver);//文件发送
					System.out.println("****************");
				Thread.currentThread().sleep(4000);


			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		/**
		 * 总流程测试1~6zaa1
		 */
		@Test
		public void zlctest(){
			String name="";
			 Util1 u=new Util1();boolean flag=false;
				try {
					u.login(driver,"xzbyg");//
					   Thread.currentThread().sleep(2000);
			 name=		u.qdlc(driver);//启动流程1
					   driver.get(baseUrl );
					    Thread.currentThread().sleep(1500);
					u.fwqc(driver);	//发文起草2
				    Thread.currentThread().sleep(2000);
					u.logout();
				    Thread.currentThread().sleep(1000);


					u.login(driver, "xzbjl");
				    Thread.currentThread().sleep(2000);
					u.fwsg(driver);//发文审稿3a
					System.out.println("aaaaaaaaaaaa");
				   // Thread.currentThread().sleep(6000);
				    //////////////////ok
			 //	u.fwsg2(driver);//发文审稿3b
			 //   driver.get(baseUrl );
				    Thread.currentThread().sleep(2000);
					u.fwhg(driver);//发文核稿4
					System.out.println("abbbbbbbbbbb");
				    Thread.currentThread().sleep(3000);
					u.logout();
				    Thread.currentThread().sleep(1000);


					u.login(driver, "dsz");
				    Thread.currentThread().sleep(2000);
					u.fwqfdsz(driver);  //5发文签发
				    Thread.currentThread().sleep(2000);
					u.logout();
				    Thread.currentThread().sleep(2000);
					u.login(driver,"xzbyg");
					u.fwcw(driver);//发文成文6
				    Thread.currentThread().sleep(2000);
					u.wjfs(driver);//文件发�?7
			System.out.println("****************");
			 Thread.currentThread().sleep(2000);
			 u.logout();
			 Thread.currentThread().sleep(2000);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						flag=true;
					e.printStackTrace();
				}
					flowok(7,name);
			lcjietu(name);//截图
		//	assert   flag==false;


		}





}
