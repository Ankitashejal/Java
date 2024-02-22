public class abstraction {
    public static void main(String[] args) {
        horse h = new horse();
        h.eat();
        h.walk();
        chicken c = new chicken();
        c.eat();
        //animal a = new Animal();//cannot create abstract class ki object bt constructor define kr sakte h

    }
}
abstract class animal{
    String color;
    animal (){
        color = "black";
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class horse extends Animal{
    void walk(){
        System.out.println("horse walks 4 legs");
    }
}
class chicken extends Animal{
    void walk(){
        System.out.println("chicken walks on 2 legs");
    }
}


