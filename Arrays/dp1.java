package Arrays;

class dp1{
    public static void main(String[] args) {
        int numbers[] = {2, 3,4,5,6,7,8};
    }
 static void reverse( int numbers[]){
    int first = 0;
    int last = numbers.length-1;
    while(first<last){
        int temp = numbers[first];
        numbers[first] = numbers[last];
        numbers[last] = temp;
        first++;
        last--;
    }
 }
}
