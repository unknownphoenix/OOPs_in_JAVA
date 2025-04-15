package StaticExample;

public class Initialsation {
    static int a = 4;
    static int b;
    static{ // this will run only once when the obj is created
        System.out.println(" I am a static block");
        b = a * 5;
    }
    public static void main(String[] args){
        Initialsation obj = new Initialsation();
        System.out.println(Initialsation.a + " " + Initialsation.b);
    }
}
