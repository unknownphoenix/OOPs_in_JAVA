package Polymorphism;

public class Numbers {
    void sum(int a, int b){
        int s = a+b;
        System.out.println(s);
    }
    void sum(int a, int b, int c){ //valid since number of arguments is different
        int s = a+ b+ c;
    }
    void match(String name, int ID){
        System.out.println("Name : " + name);
        System.out.println("Id : " + ID);
    }
    void match(int ID, String name){ // valid since order of argument is different
        System.out.println("Name : " + name);
        System.out.println("Id : " + ID);
    }
    public static void main(String[] args){
        Numbers obj1 = new Numbers(); // default constructor will be called
        Numbers obj2 = new Numbers(); // default constructor will be called
        obj1.sum(1,2);
        obj2.match("Harry", 1);
    }
}
