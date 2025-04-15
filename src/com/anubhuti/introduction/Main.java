package com.anubhuti.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll numbers
        int[] numbers = new int[5];
        // store 5 names
        String[] names = new String[5];
        // data of 5 students: {roll no., name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        Student[] student = new Student[5];
        Student Anubhuti = new Student();
//        System.out.println(Arrays.toString(student));
//        System.out.println(Anubhuti.name);
//        System.out.println(Anubhuti.marks);
//        System.out.println(Anubhuti);
//        Anubhuti.rno = 10;
//        Anubhuti.name = "Anubhuti Singh";
//        Anubhuti.changeName("Rupesh");
//        Anubhuti.greetings();
        Student S1 = new Student(77,"Nancy", 88.0f);
        Student S2 = new Student(); // constructor overloading -> Polymorphism
        S1.Copy(S2);
        System.out.println(S1.name);
        System.out.println(S1.rno);
        System.out.println(S1.marks);
        System.out.println((S2.name));
    }
}
 class Student {
     int rno;
     String name;
     float marks;
     void greetings(){
         System.out.println("Hello! My name is " + name);
     }
     void changeName(String newName){
         name = newName;
     }
     void Copy(Student other){
         this.name = other.name;
         this.rno = other.rno;
         this.marks = other.marks;
     }
     Student(){
         this.rno = 10;
         this.name = "Anubhuti Singh";
         this.marks = 90;
     }
     Student(int rno, String name, float marks){
         this.name = name;
         this.rno = rno;
         this.marks = marks;
     }
 }
