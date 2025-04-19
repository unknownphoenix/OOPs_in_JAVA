package Abstract;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(15);
        son.career("Doctor");
        son.partner("Anubhuti", 23);
        Daughter daughter = new Daughter(18);
        daughter.career("Surgeon");
        daughter.partner("Rupesh", 24);
        Parent.hello();
        son.normal();
    }
}
