package Inheritance;

public class boxWeight extends Box {
    double weight;

     boxWeight(){
        this.weight = -8;
    }
    //copy constructor in child class
    boxWeight(boxWeight other){
         super(other);
         this.weight = other.h;
         System.out.println("Copy constructor:" + weight);
    }
    boxWeight(double side, double weight){
         super(side);
         this.weight = weight;
    }
    boxWeight(double l, double h, double w, double wt){
         super(l, h, w);
         // super is used to initialize values persent in constructor class
         this.weight = w;

    }
}
