package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date=GregorianCalendar.getInstance();
        date.set(1992, 1, 6);
        Person person = new Person("Paco", date);//6 enero 92
        System.out.print(person.getName() + " tiene ");
        System.out.println(person.getAge() + " años.");
    }
    
}
