package StaticExample;

public class Main {
    public static void main(String[] args) {
//     Human Anubhuti = new Human(23, "Anubhuti Singh", 100000, false);
//        Human Rupesh = new Human(24, "Rupesh Singh", 200000, false);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//      Human Ram = new Human(20, "Ram", 50000, true);
//        System.out.println(Human.population);
        fun();
    }
    // static method: you cannot call a non static method inside a static method directly you will need an object
        static void fun () {
            Main obj = new Main();
            obj.greeting();
        }
    // but you can call a static method inside a non static method easily
        void greeting () {
            fun();
            System.out.println("Hello World!!");
        }
    }
