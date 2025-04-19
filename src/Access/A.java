package Access;

public class A {
    private int num;
    String name;
    int[] arr;

    // getters
    public int getNum(){
        return num;
    }
    // Setters
    public void setNum(int n){
        this.num = n;
    }

    A(int num, String s){
        this.num = num;
        this.name = s;
        this.arr = new int[num];
    }
}
