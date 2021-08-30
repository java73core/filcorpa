package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortSurnameDes {
    private ArrayList<Person> listPerson = new ArrayList<>();

    public void sort() {
        listPerson = new InitList().getListPerson();
        System.out.println("Sort by Surname descend");
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getSurname().compareTo(o1.getSurname());
            }
        });
        System.out.println(listPerson);
    }
}

