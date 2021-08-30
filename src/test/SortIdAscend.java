package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortIdAscend {
    private ArrayList<Person> listPerson = new ArrayList<>();

    public void sort() {
        listPerson = new InitList().getListPerson();
        System.out.println("Sort by ID ascend");
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() - o2.getId();
            }
        });
        System.out.println(listPerson);
    }
}
