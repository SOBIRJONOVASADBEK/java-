package uz.sobirjonov.spring.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.sobirjonov.spring.spring1.TestBean;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean testBean=context.getBean("testBean",TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
}
