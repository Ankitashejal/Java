package Arrays;

import java.util.Scanner;

public class count {
   
    static int countArray(int[] nums,int x){
        // int nums[] = {1,2,4,7,3,7,8,7};
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == x){
                count++;
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] nums = new int[n]; // Create an array of size n
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt(); 
        }
        
        System.out.println("Enter the number to count:");
        int x = sc.nextInt();
        
        int occurrences = countArray(nums, x); 
        
        System.out.println("Number of occurrences of " + x + " is: " + occurrences);
    }
}
