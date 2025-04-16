package Inheritance;

public class BoxPrice extends boxWeight{
    double cost;
    BoxPrice(){
        super();
        this.cost = -1;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }
    public BoxPrice(double l, double h, double w, double weight, double cost){
        super(l,h,w, weight);
        this.cost = cost;
    }
    public BoxPrice(double side, double weight, double cost){
        super(side, weight); // BoxPrice calls a constructor of boxWeight that has 2 arguments
        this.cost = cost;
    }
}
