package ComparableComparator.Set.Comparator.TrainingTask;

public class User {
    private String name;

    private Integer age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: "+ getName() + ", Age: "+ getAge();
    }
}
