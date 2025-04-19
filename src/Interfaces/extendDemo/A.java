package Interfaces.extendDemo;

public interface A {
    void fun();
    // static methods should always have body
    static void greeting(){
        System.out.println("Hey I am static method");
    }
}
