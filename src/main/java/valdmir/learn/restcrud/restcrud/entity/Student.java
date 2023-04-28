package valdmir.learn.restcrud.restcrud.entity;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {
    private String lastName;
    private String firstName;

    public Student(String lastName, String firstName) {
        this.lastName=lastName;
        this.firstName=firstName;
    }
}
