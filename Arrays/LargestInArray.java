package Arrays;

public class LargestInArray {
    public static int getLargest(int numbers[]){
        int Largest = Integer.MIN_VALUE;//infinity
    for(int i=0; i<numbers.length; i++){
        if(Largest < numbers[i]){
           Largest = numbers[i];
        }
    }
    return Largest;
    }

    public static void main(String args[]){
        int numbers[] = {1,2,6,9,3,4};
        System.out.println("Largest value is : "+getLargest(numbers));
    }
    
}
