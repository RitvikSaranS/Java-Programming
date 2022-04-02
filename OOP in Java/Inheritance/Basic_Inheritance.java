package Inheritance;
class Parent{  //super class of child class
    static int i = 8;
    int a = 6;
}
class Child extends Parent{  //subclass of parent class, specialized version of parent.
    int b = 8;
}
// A more practical example
class Box{
    int length;
    int width;
    int height;
    public Box(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public void findArea(){
        System.out.println(length * width * height);
    }
}
class Coloured_Box extends Box{
    String colour;
    public Coloured_Box(int length, int width, int height, String colour) {
        super(length, width, height); //Constructor of parent class.
        this.colour = colour;
        //TODO Auto-generated constructor stub
    }
    public void getColour(){
        System.out.println(colour);
    }
}
public class Basic_Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.b);
        System.out.println(c.a); //a is inherited from Parent class. All members except private is inherited.
        System.out.println(Parent.i); //static members are accessed by class name.

        Coloured_Box a = new Coloured_Box(2, 3, 4, "Blue");
        a.findArea();
        a.getColour();
    }
}
