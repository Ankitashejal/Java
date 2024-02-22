//java ke andar koi bhi class na private hoti h na protected bocz waise classes unusable ho jati h
public class practiceq2 {
    public static void main(String[] args) {
        vehicle obj1= new car();//due to fun overriding car will print first
        obj1.print();

        vehicle obj2= new vehicle();
        obj2.print();
    }
}
//function overriding
class vehicle{
    void print(){
        System.out.println("base class(vehicle)");
    }
}
class car extends vehicle{
    void print(){
        System.out.println("derived class(car)");
    }
}