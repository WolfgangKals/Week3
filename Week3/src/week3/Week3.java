package week3;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Alissa
 */
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee employee1 = new Employee("Fred","Flinstone", 1234, LocalDate.of(1998, Month.MARCH, 14));
       
       System.out.printf("Employee1 is %s%n", employee1);
       System.out.printf("The employee was born on %s, that was a %s%n", employee1.getDateOfBirth(),
                                                                        employee1. getDateOfBirth().getDayOfWeek());
                                                                        
                                                                        
        Employee employee2 = new Employee("Alissa","Edwards", 2345,LocalDate.of(1998, Month.APRIL, 14));
        System.out.printf("Employee is %s%n", employee2);
        System.out.printf("The employee was born on %s, that was a %s%n" , employee2.getDateOfBirth(),
                                                                           employee2.getDateOfBirth().getDayOfWeek());
                                                                           
    }
    
}
