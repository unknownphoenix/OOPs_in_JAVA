package Abstract;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }
    @Override
    public void career(String name) {
      System.out.println("I am going to be a " + name);
    }

    @Override
    public void partner(String name, int age) {
     System.out.println("I love " + name + " he is " + age);
    }
}
