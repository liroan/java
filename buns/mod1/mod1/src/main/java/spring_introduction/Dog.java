package spring_introduction;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("bow-wow");
    }

    public void init() {
        System.out.println("init dog");
    }

    public void destroy() {
        System.out.println("destroy dog");
    }
}
