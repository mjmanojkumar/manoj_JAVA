package day0405;

public class ElectronicDevices {

    public static int price;

    public static int getPrice(){
        return price;
    }

    static {
        price = 100;
        price = knowPrice();
    }

    private static int knowPrice(){
        return price;
    }

}
