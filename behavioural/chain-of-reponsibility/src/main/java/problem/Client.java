package problem;

public class Client {
    public static void main(String[] args) {
        // Extending this case is adding more ifs and makes harder to understand
        String type = "Type 1";
        if ("Type 1".equals(type)) {
            System.err.println("Do something 1");
        } else if ("Type 2".equals(type)) {
            System.err.println("Do something 2");
        } else if ("Type 3".equals(type)) {
            System.err.println("Do something 3");
        } else {
            System.err.println("Something else");
        }
    }
}
