package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by Kumar on 2/11/2016.
 */

public class Human implements Comparable<Human> {
    private int age;
    private String name;

    public Human(String givenName, int age) {
        this.name = givenName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "Hey! I'm " + name + " and I'm " + age + " years old.";
    }

    // Hint: Implement the method required by the Comparable Interface
    // using age as the differentiator
    public int compareTo(Human obj){
        Human object1 = (Human) obj;
        if(age==object1.age)
            return 0;
        else if(age>object1.age)
            return 1;
        else
            return -1;
    }
}

