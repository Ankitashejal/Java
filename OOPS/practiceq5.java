public class practiceq5 {
    public static void main(String[] args) {
        test t = new test();   //l2
        t.set_marks(10);  //l3 //t calls default fun set.marks
        System.out.println(t.marks);
    }
}
class test{
    static int marks;
    void set_marks(int marks){
        this.marks = marks; //l1
    }
}