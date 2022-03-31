public class exception_handle_by_defaultmanager {
    public static void main(String[] args) {
        System.out.println(division(4, 0));
    }
    public static int division(int a, int b){
            return a/b;
    }
}
/*
    Exception in thread "main" java.lang.ArithmeticException: / by zero
        at exception_handle_by_defaultmanager.division(exception_handle_by_defaultmanager.java:6)
        at exception_handle_by_defaultmanager.main(exception_handle_by_defaultmanager.java:3)
*/