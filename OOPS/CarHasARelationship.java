public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Car {
    private String model;
    private Engine engine; 

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}

public class CarHasARelationship {
    public static void main(String[] args) {
        Engine engine = new Engine("V8"); 
        Car car = new Car("Toyota Camry", engine); 

    
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Engine Type: " + car.getEngine().getType());
    }
}
 
