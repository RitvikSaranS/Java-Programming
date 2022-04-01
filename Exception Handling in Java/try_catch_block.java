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
            demo(5, 2);
            return 0;
        }
    }
    //Nested try catch
    public static void demo(int a, int b){
        try{
            System.out.println(8/a);
            try{
                int [] arr = new int[0];
                System.out.println(arr[b]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}


