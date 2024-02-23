public class practiceq3 {
    public static void main(String[] args) {
        System.err.println(book.count);
        book b1= new book(100);
        book b2= new book(200);
        System.out.println(book.count);
    }
}
class book{
int price;
static int count;//static variable vo hota hai jo common rehta sabke liye i dont need to make a new one everytime book obj is created.
  public book(int price){  //constructor
    this.price=price;
    count++;
}
}