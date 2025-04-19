package Abstract;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }
    @Override
    public void career(String name) {
        System.out.println("I am going to be a " + name);
    }
    @Override
    public void normal() {
        super.normal();  // here normal method is a non abstract function that is implemented in abstract class Parent
    }

    @Override
    public void partner(String name, int age) {
       System.out.println("I love " + name + " she is " + age);
    }
}
