package Arrays;

// class dp1{
//     public static void main(String[] args) {
//         int numbers[] = {2,3,4,5,6,7,8};
//         reverse(numbers);
//         for(int i = 0; i<numbers.length ; i++){
//             System.out.print(numbers[i]+ " ");
//         }
//         System.out.println();
//     }
//  static void reverse( int numbers[]){
//     int first = 0;
//     int last = numbers.length-1;
//     while(first<last){
//         int temp = numbers[first];
//         numbers[first] = numbers[last];
//         numbers[last] = temp;
//         first++;
//         last--;
//     }
//  }
// }

//pairsinarray
class dp1{
 
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        pairs(numbers);
    }
        
    public static void pairs(int numbers[]) {
        for(int i = 0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                }
                System.out.println();
            }
        }
    }

