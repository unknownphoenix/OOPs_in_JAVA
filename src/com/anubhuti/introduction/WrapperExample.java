package com.anubhuti.introduction;

public class WrapperExample {
    public static void main(String[] args){
//        Integer a = 10;
//        Integer b = 20;
//        Integer nums = 45;
//        swap(a,b);
//        System.out.println(a + " " + b);
        //when a non primitive is final you can change non final primitive variable in it but you cannot reassign it.
        final A Anubhuti = new A("miss Anubhuti");
        //you cannot reassign value to a non primitive variable
//        Anubhuti = new A("Mr. Rupesh");
        Anubhuti.name = "Other name";
        System.out.println(Anubhuti.name);
        System.out.println(Anubhuti.num);
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
   class A{
    final int num = 10;
    String name;
    public A(String name){
        this.name = name;
    }
   }
