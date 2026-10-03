package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person alonso = new Person("Alonso", LocalDate.of(2005, 11, 3));
        System.out.println(alonso.name());
        System.out.println(alonso.age());
        System.out.println(alonso.birthday());
    }
}
