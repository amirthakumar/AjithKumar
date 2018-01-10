package com.exercise.domain;

public class Director extends Manager{
  
  public double budget;
 
  public Director(int empId, String name, String ssn, double salary, String depName, double budget) {
    super(empId, name, ssn, salary, depName);
    this.budget = budget;
  }
  

}
