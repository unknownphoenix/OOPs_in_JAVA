package Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Anubhuti");

        // 1. Access the element
        System.out.println("Number: " + obj.getNum());

        // 2. Modify the element
//        obj.setNum(20);
        System.out.println("Updated Number: " + obj.getNum());
    }
}
