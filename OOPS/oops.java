public class oops{
//     public static void main(String args[]){
//     Pen p1 = new Pen();//created a pen object called p1
//     p1.setColor("Blue");
//     System.Out.Println(p1.Color);
//     p1.setTip(5);
//     System.Out.Println(p1.Tip);
//     }
// }

// class Pen{
//     string Color;
//     int Tip;

//     void setColor(String newColor){
//         color = newColor;

//     }
//     void setTip(String newTip){
//         tip = newTip;
//     }

public static void main(String[] args) {
    student s1 = new student();
    student s2 = new student("ankita");
    student s3 = new student(123);

    System.out.println(s1);
    System.out.println(s2.name);
    System.out.println(s3.roll);


}

static class student{
    String name;
    int roll;

    student(){
        System.out.println("Constructor");
    }

    student(String name) {
        this.name = name;
        // this.roll = roll;
    }

    student(int roll){
        this.roll = roll;
    }
}
}

