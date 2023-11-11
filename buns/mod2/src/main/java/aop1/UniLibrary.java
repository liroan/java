package aop1;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {
    public void getBook(Book book) {
        System.out.println("Беерем книгу из UniLibrary " + book.getName());
        System.out.println("-------------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Берем журнал из UniLibrary");
        System.out.println("-------------------------------------------------");
    }

    public void returnBook() {
        System.out.println("Возвращаем книгу в UniLibrary ");
        System.out.println("-------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UniLibrary ");
        System.out.println("-------------------------------------------------");
    }

}
