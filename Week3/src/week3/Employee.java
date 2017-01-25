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
      
      //set method which sets something,setting an instance variable.
      public void setBirthday(LocalDate dob)
      {
          LocalDate today = LocalDate.now();
          
          int age  = Period.between(dob, today).getYears();
          if (age >= 15 && age <= 90) //valid Employee dob
              this.dateOfBirth = dob;
          else
              throw new IllegalArgumentException("The employee must be 15 - 90 years old.");
          
      }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSocialInsurance() {
        return socialInsurance;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
      
}

