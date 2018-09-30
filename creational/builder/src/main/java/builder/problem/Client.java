package builder.problem;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe");
        System.err.println(employee);

        employee = new Employee("Jane", "Doe", "", 42, new Date());
        System.err.println(employee);
    }
}
