package com.exercise.domain;

public class FindTest {

  public static void main(String[] args) {
    FindClass fc=new FindClass(100,"Ajith");
    fc.addEmployee(fc);
    FindClass fc1=new FindClass(100, "kumar");
    fc1.addEmployee(fc1);
  }
}
