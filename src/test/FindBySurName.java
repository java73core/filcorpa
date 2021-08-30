package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class FindBySurName {
    private ArrayList<Person> listPerson = new ArrayList<>();

    public void findBySur(String surname) {
        listPerson = new InitList().getListPerson();
        System.out.println("Filtering by Surname: " + surname);
        ListIterator<Person> iterName = listPerson.listIterator();
        while(iterName.hasNext()){
            if(iterName.next().getSurname().equals(surname)) {
                System.out.print(iterName.previous().toString());
                iterName.next();
            }
        }
    }
}
