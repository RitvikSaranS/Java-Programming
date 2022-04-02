package Inheritance;
class Parent1{  //super class of child class
    int age;
    public Parent1(int i){
        this.age = i;
    }
}
class Child1 extends Parent1{  //subclass of parent class, specialized version of parent.
    int age;
    public Child1(int i, int j){
        super(i); //super is used to call constructor of parent class from child class.
        this.age = j;
    }
    public void displayAges(){
        System.out.println(age + "  " + super.age); //super is used to access parent members inside child class
    }
}
public class Uses_of_super {
    public static void main(String[] args) {
        Child1 c = new Child1(2, 27);
        c.displayAges();
    }
}
