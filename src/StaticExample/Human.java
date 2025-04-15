package StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    static void fun2(){
        System.out.print(Human.population); // since population is a static variable hence it can be used inside a static method
        // but we cannot use this.age or any non static variables
    }
    public Human(int age, String name, int salary, boolean married)
    {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
