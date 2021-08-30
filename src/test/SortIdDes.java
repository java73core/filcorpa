package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortIdDes {
    private ArrayList<Person> listPerson = new ArrayList<>();

    public void sort() {
        listPerson = new InitList().getListPerson();
        System.out.println("Sort by ID descend");
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getId() - o1.getId();
            }
        });
        System.out.println(listPerson);
    }
}
