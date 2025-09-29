package ComparableComparator.Set.Comparator.Task;

import java.util.Comparator;

public class AgeComparator implements Comparator<User> {

    public int compare(User u1, User u2) {
        if(u1.getAge() > u2.getAge()){
            return -1;
        }
        else if (u1.getAge()< u2.getAge()) {
            return 1;
        }
        return 0;
    }
}
