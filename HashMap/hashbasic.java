import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> mp = new HashMap<>();
        mp.put("aditi", 10);
        mp.put("ankita", 21);
        mp.put("hina", 23);
        mp.put("nidhi", 22);
        System.out.println(mp.get("ankita"));
    }
}
