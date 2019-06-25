package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import quoters.impl.TerminatorQuoter;

public class Main {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        while (true) {
            Thread.sleep(500);
            context.getBean(Quoter.class).sayQuote();
        }
    }
}