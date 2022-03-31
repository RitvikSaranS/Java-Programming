public class try_catch_block {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(division(a, b));
    }
    public static int division(int a, int b){
        try{
            int c = a/b;
            return c;
        }catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
            System.out.println(e);
        }finally{
            return 0;
        }
    }
}
