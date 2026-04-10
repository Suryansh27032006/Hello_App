public class HelloArgsJoin {
    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Join all arguments with ", "
        String names = String.join(", ", args);

        System.out.println("Hello, " + names);
    }
}