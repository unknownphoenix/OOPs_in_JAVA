package Singleton;
// when you need only 1 obj to get created in a class you can use the concept of singleton classes
public class SingletonClass {
    // hence you should not allow the constructor of this class to be called
    private SingletonClass(){
    // private constructor - can be used in this class only
    }
    private static SingletonClass instance; // so this an instance of the class singletonClass
    public static SingletonClass getInstance(){
        // check whether one obj is only created or not
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
}
