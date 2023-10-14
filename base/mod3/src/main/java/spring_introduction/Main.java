package spring_introduction;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public void menu() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = sc.nextLine();
        System.out.print("Введите логин: ");
        String login = sc.nextLine();
        System.out.print("Введите возраст: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Введите хобби через запятую: ");
        List<String> hobbies = Arrays.asList(sc.nextLine().split(","));

        User user = new User(name, login, age, hobbies);

        try {
            FileOutputStream fos = new FileOutputStream("lol.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(user);

            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fis = new FileInputStream("lol.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            User user2 = (User)ois.readObject();

            System.out.println(user2);

            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
