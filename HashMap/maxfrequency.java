
import java.util.*;

public class maxfrequency{
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4};
        Map<Integer, Integer> mp = new HashMap<>();
        for (int element : arr) {
            if (!mp.containsKey(element)) {
                mp.put(element, 1);
            } else {
                mp.put(element, mp.get(element) + 1);
            }
        }
        System.out.println("Frequency map:");
        System.out.println(mp.entrySet());
    }
}


