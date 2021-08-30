package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class FindByName {
    private ArrayList<Person> listPerson = new ArrayList<>();

    public void findName(String name) {
        listPerson = new InitList().getListPerson();
        System.out.println("Filtering by Name: " + name);
        ListIterator<Person> iterName = listPerson.listIterator();
        while(iterName.hasNext()){
            if(iterName.next().getName().equals(name)) {
                System.out.print(iterName.previous().toString());
                iterName.next();
            }
        }
    }
}
