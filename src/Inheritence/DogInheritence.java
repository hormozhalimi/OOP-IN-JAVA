package Inheritence;

public class DogInheritence {
    String size;
    String color;

    public DogInheritence() {
        this.size= "big";
        this.color = "black";
    }

    public DogInheritence(String size, String color){
        this.size = size;
        this.color =color;
    }

    public void bark (){
        System.out.println("bark : normal");
    }



}
