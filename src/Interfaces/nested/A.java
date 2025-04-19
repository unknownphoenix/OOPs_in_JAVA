package Interfaces.nested;

public class A {
    //nested interface
    //  nested interface could be public/private/protected whereas the top level interface is public/default
    // A.NestedInterface -> within A there is the NestedInterface
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}
class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
