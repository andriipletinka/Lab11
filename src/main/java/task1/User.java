package task1;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder @Getter @Setter
class Human {
    private String name;
}

@SuperBuilder @ToString @Getter @Setter
public class User extends Human {
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular
    private List<String> occupations;

//    public task1.User(String name, int age, task1.Gender gender, double weight, double height) {
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//        this.weight = weight;
//        this.height = height;
//    }
//
//    public task1.User(String name, int age, task1.Gender gender) {
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//        this.weight = 0;
//        this.height = 0;
//    }
//
//    public task1.User(String name, task1.Gender gender) {
//        this.name = name;
//        this.gender = gender;
//        this.age = 0;
//        this.weight = 0;
//        this.height = 0;
//    }
//
//    public task1.User(String name) {
//        this.name = name;
//        this.gender = null;
//        this.age = 0;
//        this.weight = 0;
//        this.height = 0;
//    }
}

class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Oles").age(31).occupation("UCU").build();
        String name = user.getName();
        System.out.println(name);
    }
}