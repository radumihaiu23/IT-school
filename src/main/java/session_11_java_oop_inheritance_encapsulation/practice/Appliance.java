package session_11_java_oop_inheritance_encapsulation.practice;

public class Appliance {

    String brand = "Generic";

    Appliance(){
        System.out.println("Appliance is created");
    }

    void function(){
        System.out.println("Appliance is functioning");
    }

}

class Refrigerator extends Appliance {

    String brand = "Arctic";

    Refrigerator(){
        super(); // calls constructor of the parent class
        System.out.println("Refrigerator is created");
    }

    void displayBrand(){
        System.out.println("Refrigerator brand: " + brand);
        System.out.println("Appliance brand: " + super.brand);
    }

    void function(){
        System.out.println("Refrigerator is cooling");
    }

    void work(){
        super.function(); // calls function() from Appliance
        function();
     }


}

class TestRefrigerator {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.displayBrand();
        refrigerator.work();
    }
}

