import java.util.HashMap;
import java.util.Map;

public class dp3hashmax {
     public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 4, 1};
        Map<Integer, Integer> mp = new HashMap<>();
        
        // Count frequency of elements
        for (int i : arr) {
            if (!mp.containsKey(i)) {
                mp.put(i, 1);
            } else {
                mp.put(i, mp.get(i) + 1);
            }
        }
        
        System.out.println(mp.entrySet());
        
        int maxFreq = 0, ansKey = -1;
        // for (var e : mp.entrySet()) {
        //     if (e.getValue() > maxFreq) {
        //         maxFreq = e.getValue();
        //         ansKey = e.getKey();
        //     }
        // }

       for (var key : mp.keySet()) {
       if (mp.get(key) > maxFreq) { //checks if the freq is greter tahn the current freq
        maxFreq = mp.get(key); //it updates `maxFreq` with the new frequency and updates `ansKey` with the current key.
        ansKey = key;
       }
}

        
        
        System.out.printf("%d has max frequency and it occurs %d times%n", ansKey, maxFreq);
    }
}
