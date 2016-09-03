package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by Kumar on 2/11/2016.
 */

public class Superhero extends Human{

    String alterEgo;

    public Superhero(String givenName, int age,String alterEgo) {
        super(givenName, age);
        this.alterEgo=alterEgo;
    }

    public String getAlterEgo() {
        return alterEgo;
    }
    public String introduce(){
        return "Hey! I'm " + super.getName() + " and I'm " + super.getAge()  + " years old. I'm also known as " + this.alterEgo +"!";
    }

}
