package Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length");
        int length = sc.nextInt();
        int[] arr = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(20);
        }
        Map<Integer, Integer> mapOfDuplicates = new HashMap<>();
        System.out.println(Arrays.toString(arr));

        for(int value : arr) {
            if(mapOfDuplicates.containsKey(value)) {
                int countDuplicates = mapOfDuplicates.get(value);
                mapOfDuplicates.put(value, ++countDuplicates);
            }
            else mapOfDuplicates.put(value, 0);
        }
        System.out.println(mapOfDuplicates);
    }
}
