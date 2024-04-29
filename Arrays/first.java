package Arrays;

public class first {

    void searchelement(){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int x = 5;
        int ans =-1;
        for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            ans = i;
            break; //if hume elem milgya stop karo this is for bar baar occurenc eof elemnt
        }
        
        }
        if(ans==-1){
            System.out.println("not found");
        }
        System.out.println("not found");
        }
        System.out.println("found"+ x + "at index"+ans);
        }
        
    

    void maxArray(){
     int arr[]={1,2,4,6,7,10,8};
     int max =0;
     for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
         max = arr[i];
        }
     }
     System.out.println(max);
    }


    void sum(){
        int arr[]={1,2,3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
        sum = sum +arr[i];
        }
        System.out.println(sum);

    }

    void multiArrays(){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // int arr_1[][] = new int[5][4];
        // System.out.println(arr[0][0]);

        for(int i=0;i<arr.length;i++){ //this loop is for traversing through array  ka wo pura barckete
            for(int j=0;j<arr.length;j++){ //ye loop hai ek bracket ke andar traverse karne ke liye eg {1,2,3} iske andar 1 se 3 travel karega ye loop
            System.out.println(arr[i][j]);

            }
        }   

    }

    void demoArrays(){
  int ages[] = new int[3];
  float weights[] = new float[3];
  String names[] ={"anki","nidhi","aditi"};

  ages[0] = 34;
  ages[1]=12;
  ages[2] = 45;

  System.out.println(ages.length);
  System.out.println(names[0]);

//   for(int i=0;i<3;i++){
// System.out.println(ages[i]);
//   }
//for each loop //pura arry print hoga yaha pe partial nahi where as for loop mai we an print partial or whatever we want
for(int age : ages){
    System.out.println(age);
}

int i=0;
while(i<3){
    System.out.println(ages[i]);
    i++;
}

    }
    public static void main(String[] args) {
        first obj = new first();
        // obj.demoArrays();
        // obj.multiArrays();
        obj.sum();
        obj.maxArray();
        obj.searchelement();
    }
}


//length operations in array
//invoke properety arr.length();