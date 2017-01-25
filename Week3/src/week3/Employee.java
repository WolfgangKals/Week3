/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Alissa
 */
public class Employee {
     private  String firstName, lastName;
      private int socialInsurance;
      private LocalDate dateOfBirth;
  
      public Employee(String first, String last, int sin, LocalDate dob)
      {
          setBirthday(dob);
          firstName = first;
          lastName = last;
          socialInsurance = sin;
          dateOfBirth = dob;
          
      }
      
      public String toString()
      {
          return firstName + " " + lastName;
      }
      
      public void setBirthday(LocalDate dob)
      {
          LocalDate today = LocalDate.now();
          
          int age  = Period.between(dob, today).getYears();
          
      }
}

