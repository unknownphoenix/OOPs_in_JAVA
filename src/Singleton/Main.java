package Singleton;

public class Main {
    public static void main(String[] args){
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();
        // all three obj reference variable is pointing to a single object
    }
}
