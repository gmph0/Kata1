package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Paco", new Date(92,0,6));//6 enero 92
        System.out.print(person.getName() + " tiene ");
        System.out.println(person.getAge() + " años.");
    }
    
}
