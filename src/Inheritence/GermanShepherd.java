package Inheritence;

public class GermanShepherd extends DogInheritence{

    protected int age;

    public GermanShepherd (){

        super("small", "red");


    }

    ///overload
    public GermanShepherd (String size, String color){
        super(size, color);
    }

    public GermanShepherd(String size, String color, int age){
        super(size, color);
        this.age=age;

    }

    @Override
    public void bark(){

        System.out.println("loud bark");
    }
}
