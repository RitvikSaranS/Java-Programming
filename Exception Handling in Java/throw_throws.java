public class throw_throws {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException("Cannot divide by zero");
        }catch(ArithmeticException e){
            System.out.println(e);
            try{
            demo1();
            }catch(NullPointerException d){
                System.out.println(d);
            }
        }
    }
    public static void demo1() throws NullPointerException{
            throw new NullPointerException("null value");
    }
}
