package builder.solution;

import java.util.Date;

public class IEmployeeBuilder implements EmployeeBuilder {

    Employee employee;

    public void init() {
        this.employee = new Employee();
    }

    public void firstName(String firstName) {
        this.employee.firstName = firstName;
    }

    public void lastName(String lastName) {
        this.employee.lastName = lastName;
    }

    public void age(Integer age) {
        this.employee.age = age;
    }

    public void createdAt(Date date) {
        this.employee.createdAt = date;
    }

    public void bio(String bio) {
        this.employee.bio = bio;
    }

    public Employee build() {
        return this.employee;
    }
}
