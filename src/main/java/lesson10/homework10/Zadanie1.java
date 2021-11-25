package lesson10.homework10;

import java.util.*;

public class Zadanie1 {

    public static void main(String[] args) {

        String[] world = {"Lexus", "Lada", "Toyota", "Range Rover", "Volvo", "Scoda", "Subaru", "Fiat", "Acura", "Lada", "Volvo", "Lexus",
                "BMW", "Scoda"};

        Set<String> set = new LinkedHashSet<>(Arrays.asList(world));
        System.out.println(set);
        System.out.println("Уникальных марок машин : " + set.size());


    }

}

