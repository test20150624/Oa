package t4;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.activation.CommandMap;
import javax.activation.MailcapCommandMap;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class sendMutiMessage {
	/**
	  *用apache commons-email 发送邮件
	  *依赖jar：commons-email.jar，activation.jar，mail.jar
	  */
	  public static void sendMutiMessage1() {

	          MultiPartEmail email = new MultiPartEmail();
	          String[] multiPaths = new String[] { "D:/test201506171137061.jpg", "D:/testng.xml" };

	          List<EmailAttachment> list = new ArrayList<EmailAttachment>();
	          for (int j = 0; j < multiPaths.length; j++) {
	              EmailAttachment attachment = new EmailAttachment();
	              //判断当前这个文件路径是否在本地  如果是：setPath  否则  setURL;
	              if (multiPaths[j].indexOf("http") == -1) {
	                  attachment.setPath(multiPaths[j]);
	              } else {
	                  try {
	                      attachment.setURL(new URL(multiPaths[j]));
	                 } catch (MalformedURLException e) {
	                      e.printStackTrace();
	                }
	              }
	              attachment.setDisposition(EmailAttachment.ATTACHMENT);
	              attachment.setDescription("Picture of John");
	              list.add(attachment);
	          }

	          try {
	              // 这里是发送服务器的名字：
	              email.setHostName("smtp.126.com");
	              // 编码集的设置
	              email.setCharset("utf-8");
	              // 收件人的邮箱
	              email.addTo("l.hllhl@163.com");//haoliang@miracles.cn
	              // 发送人的邮箱
	              email.setFrom("liuhl0@126.com");
	              // 如果需要认证信息的话，设置认证：用户名-密码。分别为发件人在邮件服务器上的注册名称和密码
	              email.setAuthentication("liuhl0", "890304");
	              email.setSubject("这是一封测试邮件");
	              // 要发送的信息
	              email.setMsg("<b><a href=\"http://www.baidu.com\">邮件测试内容</a></b>");

	              for (int a = 0; a < list.size(); a++) //添加多个附件
	              {
	                  email.attach(list.get(a));
	              }
	              // 发送
	              email.send();
	              System.out.println("send success!");
	          } catch (EmailException e) {
	              e.printStackTrace();
	          }
	      }
	  public static void main(String[] args) {
	    	MailcapCommandMap mc = (MailcapCommandMap) CommandMap.getDefaultCommandMap();
	        mc.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
	        mc.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
	        mc.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
	        mc.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
	        mc.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
	        CommandMap.setDefaultCommandMap(mc);
		  new sendMutiMessage().sendMutiMessage1();
	    }

}
