package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList persons = new ArrayList(); //20
        persons.add(1);
        persons.add("Test");
        persons.add(new Object());

        int a = (int)persons.get(1);

        ArrayList<Integer> bbb = new ArrayList<>();
        bbb.add(1);
        bbb.add(90);
      //  bbb.add("Heee");

        Account<Integer,Double> acc1 = new Account<>(12312,(double)90000);
        Account<String,Integer> acc2 = new Account<>("B3939",45454);


    }
}
