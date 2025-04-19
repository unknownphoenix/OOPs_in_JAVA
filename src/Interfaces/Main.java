package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car(); // we can use interface as the type of reference variable of the object
//        car.start();
//        car.stop();
//        car.acc();
        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
