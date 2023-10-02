package app.model;

import javax.validation.constraints.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "Name shouldnt be empty")
    @Size(min = 2, max = 25, message = "Name size incorrect")
    private String name;
    @NotEmpty(message = "Lastname shouldnt be empty")
    @Size(min = 2, max = 25, message = "Lastname size incorrect")
    private String lastName;
    @Min(value = 1, message = "Age should be greater than 0")
    @Digits(integer = 3, fraction = 0, message = "Age max length is 3")
    private int age;

    public User() {
    }

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
