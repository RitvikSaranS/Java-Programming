package Overloading;
class Area {
    public int foo(int a, int b){
        return a * b;
    }
    public int foo(int a, int b, int c){
        return a * b*  c;
    }
}
public class overloading_method_in_java {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println(a.foo(2, 3));
        System.out.println(a.foo(2, 3, 4));
    }
}

