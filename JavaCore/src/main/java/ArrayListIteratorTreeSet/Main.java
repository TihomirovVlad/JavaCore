package ArrayListIteratorTreeSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfRandomNumbers = new ArrayList<Integer>(100);
        for (int i = 0; i <= 100; i++) {
            Integer randomValue = new Random().nextInt(0,20);
            listOfRandomNumbers.add(randomValue);
        }
        System.out.println(listOfRandomNumbers);
        Iterator<Integer> iter = listOfRandomNumbers.iterator();
        while (iter.hasNext()) {
            if(iter.next()%2==0){
                iter.remove();
            }
        }
        System.out.println(listOfRandomNumbers);
        Set<Integer> treeSet = new TreeSet<>(listOfRandomNumbers);
        System.out.println(treeSet);
    }
}
