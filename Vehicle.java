//creat class
class Vehicle {

    // Private data members 
    private String brand;
    private String color;

    // Constructor: object
    public Vehicle(String brand, String color) {
        this.brand = brand;   // brand assign
        this.color = color;   // color assign
    }

    // Public method: vehicle print
    public void start() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle is starting...");
        System.out.println(); 
    }
}

// Main class 
public class MainIT24046 {

    public static void main(String[] args) {

        // Command line arguments pair
        //  pair = brand + color
        for (int i = 0; i < args.length - 1; i += 2) {

            // Vehicle object
            Vehicle v = new Vehicle(args[i], args[i + 1]);

            // start() method call 
            v.start();
        }
    }
}
