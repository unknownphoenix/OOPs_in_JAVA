package Abstract;

public abstract class Parent {
    // parent class is an abstract class that can have (abstract + non abstract methods)
    int age;
    Parent(int age){
        this.age = age;
    }
    static void hello(){
        System.out.println("Hey");
    }
    void normal(){
        System.out.println("This is a normal method");
    }
    public abstract void career(String name);
    public abstract void partner(String name, int age);
}
