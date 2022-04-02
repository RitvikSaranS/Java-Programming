public class passing_arguments_in_method {
    public static void main(String[] args) {
        int a = 2;
        Primitives(a);
        System.out.println(a); //still prints 2
        Demo m = new Demo(5);
        non_Primitives(m);
        System.out.println(m.a); //prints 6, bcz reference itself is passed by call by value.
    }
    public static void Primitives(int a){
        a+=1;
    }
    public static void non_Primitives(Demo a){
        a.a = 6;
    }
}
class Demo{
    public int a;
    public Demo(int a){
        this.a = a;
    }
}
