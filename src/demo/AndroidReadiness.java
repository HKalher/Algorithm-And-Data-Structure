package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by Kumar on 2/11/2016.
 */

public class AndroidReadiness {
    public static void main(String[] args)
    {

        // Test your code here:

        // Some sample instances
        Superhero batman = new Superhero("Bruce", 26, "Batman");
        Human rachel = new Human("Rachel", 24);
        // Create some more characters!


        // Make some introductions
        // Note: Superheroes should also share their alter ego! For example,
        // System.out.println(batman.introduce());
        // should print to std out:
        // Hey! I'm Bruce and I'm 26 years old. I'm also known as Batman!
        System.out.println(batman.introduce());
        System.out.println(rachel.introduce());


        // Testing your Comparable Interface:
        // Create multiple Humans/Superheros and add them to an ArrayList
        // Example:
        // Superhero ironman = new Superhero("Tony", 35, "Ironman");
        // Human pepper = new Human("Pepper", 22);

        // List<Human> people = new ArrayList<Human>();
        // people.add(batman);
        // people.add(rachel);
        // people.add(ironman);
        // people.add(pepper);

        // Loop through the list and print out their names.
        // With the above example, you would expect the ordered output
        // Bruce Rachel Tony Pepper

        // Then sort your list (which uses your interface implementation)
        // Collections.sort(people);

        // Print out a list of names, now sorted by age
        // With the above example, the newly sorted output should be
        // Pepper Rachel Bruce Tony
    }
}
