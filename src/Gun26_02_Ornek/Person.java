package Gun26_02_Ornek;

import java.util.Locale;

public class Person {
    String name;
    String surname;
    int age;

    public void Bilgiyazdir() {

        System.out.println("name=" + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
    }

    public String toString() {
        return name + "\t" + surname + "\t" + age;

    }
    public void getbirthyear(){
        System.out.println("dogum yiliniz ="+(2022- age));
    }
    public void getInitials()
    {
        System.out.println(name.toUpperCase().charAt(0)+"."+ surname.toUpperCase().charAt(0));

    }
}
