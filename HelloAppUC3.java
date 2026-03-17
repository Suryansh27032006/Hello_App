public class HelloAppUC3 {
    public static void main(String[] args) {

        // Assign name based on argument or default
        String name = (args.length > 0) ? args[0] : "World";

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}