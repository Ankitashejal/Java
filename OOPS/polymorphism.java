public class polymorphism {
    public static void main(String[] args) {
        calculator calci = new calculator();
        System.out.println(calci.sum(1,2));
        System.out.println(calci.sum(16,4 ));
        
    }

}
class calculator{
    int sum(int a ,int b){
        return a+b;
    }

    float sum(float a, float b){
    return a+b;
    }
   
}
