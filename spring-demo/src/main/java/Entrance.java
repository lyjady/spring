import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.service.WelcomeService;

/**
 * @author LinYongJin
 * @date 2020/8/10 19:39
 */
public class Entrance {

	public static void main(String[] args) {
		String xmlPath = "classpath:spring-context.xml";
		ApplicationContext context = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = context.getBean("welcomeService", WelcomeService.class);
		welcomeService.welcome("SpringFramework");
	}
}
