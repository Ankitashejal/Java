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
    student s1 = new student("ankita",52);
    System.out.println(s1.name);
}

static class student{
    String name;
    int roll;

    student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}
}

