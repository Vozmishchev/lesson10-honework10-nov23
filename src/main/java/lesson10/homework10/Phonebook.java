package lesson10.homework10;

import java.util.*;

public class Phonebook {

    private Map<String, HashSet<String>> pb;


    Phonebook() {
        this.pb = new HashMap<>();
    }

    void add(String name, String numberPhone) {
        HashSet<String> numbers;

        if (pb.containsKey(name)) {
            numbers = pb.get(name);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(numberPhone);
        pb.put(name, numbers);

    }

    HashSet<String> get(String name) {
        for (Map.Entry<String, HashSet<String>> item : pb.entrySet()) {
            System.out.printf("%s  %s\n", item.getKey(), item.getValue());
        }
        System.out.println("====================");
        return pb.get(name);

    }
}




