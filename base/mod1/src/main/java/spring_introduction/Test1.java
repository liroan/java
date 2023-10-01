package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test1 {
    public static void main(String[] args) {
        MathHomework mathHomework = new MathHomework();
        System.out.println(mathHomework.findMinInArray());
    }
}
