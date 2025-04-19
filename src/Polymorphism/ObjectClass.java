package Polymorphism;

public class ObjectClass {
    int sum;
    void PrintObj(int a, int b){
        sum = a + b;
    }
    @Override
    public String toString () {
        return "Value of sum = " + sum;
    }

    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass();
    }
}
