package Overloading;
public class overloading_constructor {
    public static void main(String[] args) {
        Demo d1 = new Demo(5); //first constructor
        Demo d2 = new Demo(2,3); //second constructor
        d1.getvalues();
        d2.getvalues();
    }
}
class Demo{
    int a;
    int b;
    public Demo(int a){
        this.a = a;
        this.b = 0; 
    }
    public Demo(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void getvalues(){
        System.out.println(a + "  " + b);
    }
}
