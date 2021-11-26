package Pac2;

import javax.xml.stream.FactoryConfigurationError;
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 42L;
    private  int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
