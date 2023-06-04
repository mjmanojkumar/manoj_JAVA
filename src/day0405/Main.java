package day0405;

public class Main {
    public static void main(String[] args){

        Person p1 = new Person();
        p1.isWalking();
        p1.isTalking();


        Vehicle v = new Vehicle("Car");
        System.out.println(v.variable1);

        Car c1 = new Car("Audi", "BMW");
        System.out.println(c1.variable1);
        System.out.println(c1.variable2);

        Car c2 = new Car("Ferrari");
        System.out.println(c2.variable2);

        //Create a class with a static variable of type int and a static method that returns an int.
        System.out.println(ElectronicDevices.price);

            Phone p = new Phone();
            System.out.println(p.phonePrice);
        }
    }

