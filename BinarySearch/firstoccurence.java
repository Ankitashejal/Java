package BinarySearch;

public class firstoccurence {

    static int occurence(int a[], int x){
        int n=a.length;
        int st=0, end = n-1;
        int fo =-1;
        while(st<=end){
            int mid= st+(end -st)/2;
            if(a[mid]==x){
                fo = mid;
                end = mid-1;

            } else if(x<a[mid]){
                  end =mid-1;
            }else{
                
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,1,5,6,1,8,9};
        int x =1;


    }
}
