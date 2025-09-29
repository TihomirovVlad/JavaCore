package ComparableComparator.Set.Comparator.TrainingTask;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<User> {

    public int compare(User p1, User p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
