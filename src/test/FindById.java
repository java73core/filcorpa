package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class FindById  {
    private ArrayList<Person> listPerson = new ArrayList<>();
    public void findId(int id) {
        listPerson = new InitList().getListPerson();
        ListIterator<Person> iterName = listPerson.listIterator();
        while(iterName.hasNext()){
            if(iterName.next().getId() == id) {
                System.out.print(iterName.previous().toString());
                iterName.next();
            }
        }
    }
}


