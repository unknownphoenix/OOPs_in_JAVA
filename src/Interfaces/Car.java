package Interfaces;

public class Car implements Engine, Brake{ // multiple inheritance is allowed in inheritance
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() { // it does not matter which funct Car is overriding because it has its own implementation
        System.out.println("I stop like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }

}
