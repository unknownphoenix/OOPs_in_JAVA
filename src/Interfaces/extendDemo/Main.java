package Interfaces.extendDemo;

public class Main implements B{
    @Override
    public void fun() {
        System.out.println("I am in fun");
    }

    @Override
    public void greet() {
        System.out.println("I am in greet");
    }
}
