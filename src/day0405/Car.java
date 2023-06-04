package day0405;

public class Car extends Vehicle {

     public String variable2;

    public Car(String variable1, String variable2) {
        super(variable1);
        this.variable2 = variable2;
    }

    public Car(String variable2) {
        this.variable2 = variable2;
    }
}
