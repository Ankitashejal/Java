public class sumoffact {

    static int sum(int n){
    if(n==1){
        System.out.println(n);
        return 1;
    }
    
    int snm1 = sum(n-1);
    int sn = n + snm1;
    return sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.print(sum(n));
       
    }
}
