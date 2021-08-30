package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortBySexF {
    private ArrayList<Person> listPerson = new ArrayList<>();

    public void sort() {
        listPerson = new InitList().getListPerson();
        System.out.println("Sort by sex F first");
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSex() - o2.getSex();
            }
        });
        System.out.println(listPerson);
    }
}
