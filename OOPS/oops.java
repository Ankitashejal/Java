public class OOPS{
    public static void main(String args[]){
    Pen p1 = new Pen();//created a pen object called p1
    p1.setColor("Blue");
    System.Out.Println(p1.Color);
    p1.setTip(5);
    System.Out.Println(p1.Tip);
    }
}

class Pen{
    string Color;
    int Tip;

    void setColor(String newColor){
        color = newColor;

    }
    void setTip(String newTip){
        tip = newTip;
    }
}

