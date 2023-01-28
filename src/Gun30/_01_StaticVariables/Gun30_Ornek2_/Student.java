package Gun30._01_StaticVariables.Gun30_Ornek2_;

public class Student {
    int id;
    int String;
    String fullname;
    static int sayac = 1;

    public Student(int id, String fullname) {
        this.id = id;
        this.fullname = fullname;

    }

    public Student(String fullname) {
        this.id = sayac++;
        this.fullname = fullname;

    }

    @Override
    public java.lang.String toString() {
        return "Student{" +
                "id=" + id +
                ", String=" + String +
                ", fullname='" + fullname + '\'' +
                '}';

    }
}


