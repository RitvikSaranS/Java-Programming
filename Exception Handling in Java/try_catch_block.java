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
            demo1(5, 2);
            demo2(0, 3);
            demo3(0, 2);
            return 0;
        }
    }
    //Nested try catch
    public static void demo1(int a, int b){
        try{
            System.out.println(8/a);
            try{
                int [] arr = new int[0];
                System.out.println(arr[b]);
            }catch(ArithmeticException e){
                System.out.println(e);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    public static void demo2(int a, int b){
        try{
            //System.out.println(a/0); //If this statement is included, this will only include ArithmeticException
            int [] arr = new int[0];
            System.out.println(arr[b]);
        }catch(ArithmeticException e){
                System.out.println(e);
            }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    public static void demo3(int a, int b){
        //Causes compliation  error, exception is already handled by exception and not arithmeticexception
        try{
            System.out.println(a/0); 
        }catch(Exception e){
                System.out.println(e);
            }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}


