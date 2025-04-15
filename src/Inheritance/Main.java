package Inheritance;

public class Main {
    public static void main(String[] args){
        Box box1 = new Box(2.0, 5.0, 9.0);
        Box box2 = new Box(box1);
        boxWeight abc = new boxWeight();
        boxWeight def = new boxWeight(abc);
       // System.out.println(box1.l + " " + box1.h + " "+ box1.w);
//        boxWeight box3 = new boxWeight();
//        boxWeight box4 = new boxWeight(2.0, 4.9, 5.0, 20.0);
//        System.out.println(box3.h + " "+ box3.weight);
        Box box5 = new boxWeight(2,3,4,5);
        //System.out.println(box5.weight);
        // it is the type of reference variable that determines what values will the obj be able to access.
        //boxWeight  box6 = new Box(1,2,3); // error -> since value of weight is missing in Box so it cannot be initialized, so you are basically calling a constructor that is not present in Box class
        //boxWeight box7 = new Box(1,2,3,4); // Invalid

    }
}
