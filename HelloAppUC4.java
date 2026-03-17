public class HelloAppUC4 {
    public static void main(String[] args) {

        String names;

        // Check if arguments exist
        if (args.length > 0) {
            names = String.join(", ", args);
        } else {
            names = "World";
        }

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}