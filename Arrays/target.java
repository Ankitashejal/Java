package Arrays;

public class target {

    static int pairsum( int arr[],int target) {
int n= arr.length;
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++){
            if(arr[i]+arr[j] == arr[target]){
                ans++;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        

    }
}
