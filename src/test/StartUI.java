package test;

import java.util.Arrays;
import java.util.List;

public class StartUI {

    public static void main(String[] args) {
        List<String> menu = Arrays.asList("Show All List", "Find By Id", "Find By Name", "Find By Surname", "Find Year of Birthday",
                "Find By Sex", "Sort Name descend", "Sort Name Ascend", "Sort Surname descend", "Sort Surname Ascend",
                "Sort By Sex F", "Sort By Sex M", "Sort Id descend", "Sort Id Ascend", "Sort By Year descend", "Sort By Year Ascend", "Exit");

        boolean action = true;
        while (action) {
            int i = 1;
            for (String s: menu) {  System.out.println(i++ + ". " + s); }
            int index = new ConsoleInput().askInt("What you select now? ");
            switch (index) {
                case 1: {
                    new ShowAllList().showAll();
                    break;
                }
                case 2: {
                    new FindById().findId(new ConsoleInput().askInt("Please, enter ID for searching: "));
                    break;
                }
                case 3: {
                    new FindByName().findName(new ConsoleInput().askStr("Please, enter Name for searching: "));
                    break;
                }
                case 4: {
                    new FindBySurName().findBySur(new ConsoleInput().askStr("Please, enter Surname for searching: "));
                    break;
                }
                case 5: {
                    new FindYear().findBirthYear(new ConsoleInput().askInt("Please, enter Year of Birthday for searching: "));
                    break;
                }
                case 6: {
                    new FindBySex().findSex(new ConsoleInput().askChar("Please enter Sex for searching: "));
                    break;
                }
                case 7: {
                    new SortNameDes().sort();
                    break;
                }
                case 8: {
                    new SortNameAscend().sort();
                    break;
                }
                case 9: {
                    new SortSurnameDes().sort();
                    break;
                }
                case 10: {
                    new SortSurnameAscend().sort();
                    break;
                }
                case 11: {
                    new SortBySexF().sort();
                    break;
                }
                case 12: {
                    new SortBySexM().sort();
                    break;
                }
                case 13: {
                    new SortIdDes().sort();
                    break;
                }
                case 14: {
                    new SortIdAscend().sort();
                    break;
                }
                case 15: {
                    new SortByYearDes().sort();
                    break;
                }
                case 16: {
                    new SortByYearAscend().sort();
                    break;
                }
                case 17: {
                    action = false;
                    System.out.println("Good bye!");
                    break;
                }
                default: {
                    System.out.println(" Please, select operation from list!");
                    break;
                }
            }
        }
    }
}
