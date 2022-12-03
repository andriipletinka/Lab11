package task2;

import lombok.Getter;
import lombok.Setter;
import task1.Gender;

public class Client {
    private static int count = 0;
    @Getter
    private int id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private Gender sex;

    public Client(String name, int age, String email, Gender sex) {
        id = ++count;
        this.name = name;
        this.age = age;
        this.email = email;
        this.sex = sex;
    }
}
