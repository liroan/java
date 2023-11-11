package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Person {
    // @Qualifier("dog")
    private  Pet pet;
    // @Value("Larikov")
    //@Value("${person.surname}")
    private String surname;


//    @Autowired
    public Person(Pet pet) {
        System.out.println("Person");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello");
        pet.say();
    }
}
