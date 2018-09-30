package builder.problem;

import java.util.Date;

public class Employee {

    String firstName;
    String lastName;
    String bio;
    Integer age;
    Date createdAt;


    // Too much arguments and possibilities to create a new Employee

    public Employee(String firstName, String lastName, String bio, Integer age, Date createdAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.age = age;
        this.createdAt = createdAt;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.bio = "";
        this.createdAt = new Date();
    }

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
