import config.AppConfig;
import input.MessageInput;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageInput consoleMessageInput = (MessageInput) context.getBean("consoleMessageInput");
        MessageInput fileMessageInput = (MessageInput) context.getBean("fileMessageInput");
        MessageInput defaultMessage = (MessageInput) context.getBean("defaultMessage");

        String consoleMessage = consoleMessageInput.getInputMessage();
        System.out.println("1. " + consoleMessage);

        String fileMessage = fileMessageInput.getInputMessage();
        System.out.println("2. " + fileMessage);

        String defaultMessageS = defaultMessage.getInputMessage();
        System.out.println("3. " + defaultMessageS);
    }
}
