package ComparableComparator.Set.Comparable;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> peoples = new TreeSet<Person>();
        peoples.add(new Person("Vlad"));
        peoples.add(new Person("Dlad"));
        peoples.add(new Person("Glad"));
        peoples.add(new Person("Vaad"));
        System.out.println(peoples);
    }
}
