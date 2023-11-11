package spring_introduction;

public class Person {
    private  Pet pet;
    private String surname;


    public Person() {

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello");
        pet.say();
    }
}
