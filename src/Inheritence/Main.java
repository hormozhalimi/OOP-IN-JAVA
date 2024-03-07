package Inheritence;

import Inheritence.DogInheritence;
import Inheritence.GermanShepherd;

class Main {
    public static void main(String[] args){

    GermanShepherd g1 = new GermanShepherd("tiny", "white", 100);

    System.out.println(g1.color);
    System.out.println(g1.size);
    System.out.println(g1.age);

}
}