import java.util.HashMap;
import java.util.Map;

public class hashdp2 {
    public static void main(String[] args) {
	    int arr[]={1,3,2,1,4,1};
	    Map<Integer,Integer> mp = new HashMap<>();
	    for(int i : arr){
	        if(!mp.containsKey(i)){
	            mp.put(i,1);
	        }else{
	            mp.put(i,mp.get(i)+1);
	        }
	        
	    }
		System.out.println(mp.entrySet());
	}
}
