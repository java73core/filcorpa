package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortBySexM {
    private ArrayList<Person> listPerson = new ArrayList<>();

    public void sort() {
        listPerson = new InitList().getListPerson();
        System.out.println("Sort by sex M first");
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getSex() - o1.getSex();
            }
        });
        System.out.println(listPerson);
    }
}
