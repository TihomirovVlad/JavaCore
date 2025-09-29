package hashEqualsHashCode.MiniTrainingProj;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addNewUser(new User("Vlad" ,"HelloWorld", LocalDate.of(2020,10,10)));
        manager.addNewUser(new User("Artem" ,"HelloMap", LocalDate.now()));
        manager.addNewUser(new User("Levan" ,"pass1", LocalDate.now()));

        System.out.println("Sort by login");
        manager.getAllUsers("login");

        System.out.println("Sort by date");
        manager.getAllUsers("date");

        manager.editUser(new User("Vlad","passwordTrue", LocalDate.of(2023,12,11)));
        manager.getAllUsers("login");
    }
}
