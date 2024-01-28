package Arrays;

import java.util.Arrays;;
class main{
public static void main(String[] args) {
    int numbers[]={2,4,5,6,7,8,};
    int key = 10;
    int index=ls(numbers,key);
    if(index==-1){
        System.out.println("key not found");
    }
    else{
        System.out.println("key found at index "+index);
    }
}
static int ls(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
        if (numbers[i]==key){
            return i;
        }
    }
    return -1;
}
}