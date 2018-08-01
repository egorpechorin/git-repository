package one.circles;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    ArrayList<String> words = new ArrayList<String> ();

    public static void main(String[] args) {
	    //task 1
        System.out.println("------");
        System.out.println("task 1");
        ArrayList<String> words = new ArrayList<String> ();

        words.add("dog");
        words.add("car");
        words.add("bottom");
        words.add("door");
        words.add("lift");

        words.add("number");
        words.add("ten");
        words.add("dog");
        words.add("size");
        words.add("door");

        words.add("number");
        words.add("nine");
        words.add("dog");
        words.add("size");
        words.add("door");

        System.out.println(words);

        for (int i=0;i<words.size();i++) {
            for (int j=i+1;j<words.size();j++) {
                if (words.get(i)==words.get(j)){
                    words.remove(j);
                }
            }
        }

        System.out.println(words);

        //task 2
        System.out.println("------");
        System.out.println("task2");

        Phonebook phonebook = new Phonebook();

        phonebook.add("Viktorov", "372596171208");
        phonebook.add("Alekseev", "372780321942");
        phonebook.add("Viktorov", "372789510234");
        phonebook.add("Antonov", "372452258561");
        phonebook.add("Petrov", "372454785259");
        phonebook.add("Antonov", "372301945877");
        phonebook.add("Viktorov", "372478524563");

        phonebook.printPhonebook();
    }
}
