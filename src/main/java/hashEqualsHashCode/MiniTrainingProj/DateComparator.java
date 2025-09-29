package hashEqualsHashCode.MiniTrainingProj;

import java.time.LocalDate;
import java.util.Comparator;

public class DateComparator implements Comparator<User> {

    public int compare(User user1, User user2) {
        if(user1.getCreationDate().isBefore(user2.getCreationDate())){
            return 1;
        }
        else if(user2.getCreationDate().isAfter(user1.getCreationDate())){
            return -1;
        }
        else{
            return 0;
        }


    }
}
