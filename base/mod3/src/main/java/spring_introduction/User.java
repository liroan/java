package spring_introduction;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

class User implements Serializable {
    private final String name;
    private final String login;
    private final int age;
    private final List<String> hobbies;

    public User(String name, String login, int age, List<String> hobbies) {
        this.name = name;
        this.login = login;
        this.age = age;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return String.format("Пользователь: %s, с логином: %s. Его возраст: %d.\nВсе хобби: \n\n", name, login, age) + String.join("\n\n", hobbies);
    }
}
