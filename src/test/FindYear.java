package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class FindYear {
    private ArrayList<Person> listPerson = new ArrayList<>();

    public void findBirthYear(int yearBirth) {
        listPerson = new InitList().getListPerson();
        System.out.println("Filtering by Year of Birthday: " + yearBirth);
        ListIterator<Person> iterName = listPerson.listIterator();
        while(iterName.hasNext()){
            if(iterName.next().getBirthYear() == yearBirth) {
                System.out.print(iterName.previous().toString());
                iterName.next();
            }
        }
    }
}
