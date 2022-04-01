public class creating_exception_subclasses {
    public static void main(String[] args) throws Nameexception {
        demo("Ritvik");
    }
    public static void demo(String name) throws Nameexception{
        try{
            if(name == "Ritvik") throw new Nameexception("You are banned!!!");
            System.out.println("Welcome " + name);
        }catch(Nameexception e){
            System.out.println(e);
        }
    }
}
class Nameexception extends Exception{
    String name;
    public Nameexception(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Permission denied" + name;
    }
}