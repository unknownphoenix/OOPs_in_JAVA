package StaticExample;

public class InnerClass{ // outer class is not static
    static class Test{ // this is an inner class that is static
        String name;
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args){
         //cretion of an object will give me an error if
        Test a = new Test("Anubhuti");
        Test b = new Test("Rupesh");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
