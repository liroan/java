package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.context2.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
//        Cat cat = context.getBean("catBean", Cat.class);
//
//        cat.say();

        context.close();
    }
}
