package builder.solution;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder = new IEmployeeBuilder();
        employeeBuilder.init();
        employeeBuilder.age(42);
        employeeBuilder.bio("");
        employeeBuilder.firstName("Jane");
        employeeBuilder.lastName("Doe");
        employeeBuilder.createdAt(new Date());
        Employee employee = employeeBuilder.build();

        System.err.println(employee);
    }
}
