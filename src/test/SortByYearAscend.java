package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByYearAscend {
    private ArrayList<Person> listPerson = new ArrayList<>();

    public void sort() {
        listPerson = new InitList().getListPerson();
        System.out.println("Sort by Year of Birth ascend");
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getBirthYear() - o2.getBirthYear();
            }
        });
        System.out.println(listPerson);
    }
}

