package test;
public class Person {
    private char sex;

    private String name;

    private String surname;

    private int birthYear;

    private int id;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getId() {
        return id;
    }

    public char getSex() {
        return sex;
    }

    public Person(int id, String name, String surname, char sex, int birthYear) {
        this.birthYear = birthYear;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", sex='" + sex  + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                '}' + System.lineSeparator();
    }
}
