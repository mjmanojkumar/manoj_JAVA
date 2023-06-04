package day010203;




public class Main{
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Manoj Kumar Barugu");
        String name = student.getName();
        System.out.println("Name: " + name);
        //System.out.println(student.getName());

        Administration a = new Administration();
        System.out.println(a.getDepartmenSize());

        Product product = new Product();
        product.setPrice(10.0);

        double basePrice = product.getPrice();
        System.out.println("Base price: " + basePrice);

        int quantity = 5;
        double Price = product.getPrice(quantity);
        System.out.println("Total price for " + quantity + " items: " + Price);

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();








    }
}