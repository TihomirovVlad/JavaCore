package ComparableComparator.Set.Comparator.TrainingTask;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<User> peoples = new TreeSet<>(pcomp);
        peoples.add(new User("Vlad",20));
        peoples.add(new User("Vladimir",19));
        peoples.add(new User("Serega",13));
        peoples.add(new User("Petya",12));
        peoples.add(new User("Petya",2));
        peoples.add(new User("Arbuz",25));

        for (User p : peoples) {
            System.out.println(p);
        }
    }
}
