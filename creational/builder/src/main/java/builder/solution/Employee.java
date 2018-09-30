package builder.solution;

import java.util.Date;

public class Employee {

    String firstName;
    String lastName;
    String bio;
    Integer age;
    Date createdAt;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bio='" + bio + '\'' +
                ", age=" + age +
                ", createdAt=" + createdAt +
                '}';
    }
}
