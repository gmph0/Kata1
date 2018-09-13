package kata1;

import java.time.LocalDate;
import static java.time.LocalDate.of;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date=new LocalDate(1992, 1, 6);
        Person person = new Person("Paco", date);//6 enero 92.
        System.out.print(person.getName() + " tiene ");
        System.out.println(person.getAge() + " años.");
    }
    
}
