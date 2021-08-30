package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class FindBySex {
    private ArrayList<Person> listPerson = new ArrayList<>();

    public void findSex(char sex) {
        listPerson = new InitList().getListPerson();
        System.out.println("Filtering by sex: " + sex);
        ListIterator<Person> iterName = listPerson.listIterator();
        while(iterName.hasNext()){
            if(iterName.next().getSex() == sex) {
                System.out.print(iterName.previous().toString());
                iterName.next();
            }
        }
    }
}
