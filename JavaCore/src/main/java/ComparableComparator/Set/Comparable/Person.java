package ComparableComparator.Set.Comparable;

public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name "+ name;
    }

    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.getName());
    }
}
