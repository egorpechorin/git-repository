package one.circles;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    HashMap<String, String> phonebook;

    public Phonebook (){
        this.phonebook=new HashMap<>();
    }

    public void add(String name, String numbers){
        if (phonebook.containsKey(name)){
            String x =phonebook.get(name)+";"+numbers;
            phonebook.remove(name);
            phonebook.put(name,x);
        } else {phonebook.put(name, numbers);}
    }

    public  void printPhonebook (){
        Set<Map.Entry<String,String>> set = phonebook.entrySet();
        for (Map.Entry<String,String> i : set){
            System.out.println(i.getKey()+"  :  "+i.getValue());
        }
    }
}
