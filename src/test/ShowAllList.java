package test;

import java.util.ArrayList;

public class ShowAllList {
    private ArrayList<Person> listPerson = new ArrayList<>();
    public void showAll() {
        listPerson = new InitList().getListPerson();
        System.out.println(listPerson);
    }
}
