package ComparableComparator.Set.Comparator.TrainingTask;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<User> {

    @Override
    public int compare(User p1, User p2) {
        return p1.getAge().compareTo(p2.getAge());
    }
}
