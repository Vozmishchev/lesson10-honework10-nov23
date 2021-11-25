package lesson10.homework10;

import java.util.*;

public class Zadanie2 {
    public static void main(String[] args) {

        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "+72225551111");
        pb.add("Petrov", "+71564154654");
        pb.add("Sidorov", "+7465446644");
        pb.add("Ivanov", "+79904342423");


        System.out.print(pb.get("Ivanov"));




    }

}












