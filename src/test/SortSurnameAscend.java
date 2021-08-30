package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortSurnameAscend {
    private ArrayList<Person> listPerson = new ArrayList<>();

    public void sort() {
        listPerson = new InitList().getListPerson();
        System.out.println("Sort by Surname ascend");
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
        System.out.println(listPerson);
    }
}
