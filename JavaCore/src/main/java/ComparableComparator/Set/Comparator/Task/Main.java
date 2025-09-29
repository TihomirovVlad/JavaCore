package ComparableComparator.Set.Comparator.Task;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NameComparator namePcomp = new NameComparator();
        AgeComparator agePcomp = new AgeComparator();
        List<User> users = new ArrayList<>();
        users.add(new User("Vlad",20));
        users.add(new User("Vladimir",19));
        users.add(new User("Serega",13));
        users.add(new User("Petya",12));
        users.add(new User("Petya",2));
        users.add(new User("Arbuz",25));

        System.out.println("Default");
        showUsers(users);

        users.sort(namePcomp);
        System.out.println("\nПо имени");
        showUsers(users);

        users.sort(agePcomp);
        System.out.println("\nПо возрасту и имени");
        showUsers(users);

        users.add(new User("Arbuz",25));
        users.add(new User("Arbuz",35));
        users.add(new User("Arbuz",15));
        users.add(new User("Arbuz",5));
        users.sort(namePcomp.thenComparing(agePcomp));
        System.out.println("\nСначала по имени, если одинаковые, по возрасту\n");
        showUsers(users);
    }

    private static void showUsers(List<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
