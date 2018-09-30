package builder.solution;

import java.util.Date;

public interface EmployeeBuilder {

    void init();

    void firstName(String firstName);
    void lastName(String lastName);
    void age(Integer age);
    void createdAt(Date date);
    void bio(String bio);

    Employee build();
}
