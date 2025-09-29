package ComparableComparator.Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listElements = new ArrayList<String>();
        listElements.add("C");
        listElements.add("B");
        listElements.add("G");
        listElements.add("A");
        System.out.println(listElements);
        Set<String> setElements = new TreeSet<>(listElements);
        System.out.println(setElements);
    }
}
