package BinarySearch;

public class dp1 {

    // static boolean binary(int[] a, int target) {
    //     int n = a.length;
    //     int st = 0, end = n - 1;
    //     while (st <= end) {
    //         int mid = (st + end) / 2;
    //         if (target == a[mid]) {
    //             return true;
    //         } else if (target < a[mid]) {
    //             end = mid - 1;
    //         } else {
    //             st = mid + 1;
    //         }
    //     }
    //     return false;
    // }

    static boolean recbinarysearch(int[] a,int st,int end,int target) {
        if(st>end) return false;
        int mid = (st+end)/2; //st(st+end/)2
        if(target==a[mid]){
            return true;
        }else if(target< a[mid]){
            return recbinarysearch(a,st,mid-1,target);
        }else{
            return recbinarysearch(a,mid+1,end,target);
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int target = 4;
        int st = 0;
        int end = a.length - 1;
        // System.out.println(binary(a, target)); 
        System.out.printf("%d exists in arr : %b \n",target,recbinarysearch(a, st , end, target));
        System.out.println();

    }
}
