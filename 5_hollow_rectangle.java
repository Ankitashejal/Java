public class hollow_rectangle {
public static void star (int totRows,int totCols) {
     for(int i=1;i<=totRows;i++) {
       for(int j=1;j<=totCols;j++) {
        if(i==1|| i==totRows|| j==1|| j==totCols) {
            System.out.print("*");
        } else{
            System.out.print(" "); 
        }
       }
       System.out.println();
       }
      }
    public static void main(String args[]) {
<<<<<<<< HEAD:hollow_rectangle.java
      star (4,5);
========
     star (4,5);
>>>>>>>> 9672219f337ca1349b5fbbe01b34f167e835ecb5:5_hollow_rectangle.java

    }

}
