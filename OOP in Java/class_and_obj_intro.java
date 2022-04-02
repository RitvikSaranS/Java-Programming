class Box{
    double length;
    double width;
    double height;
    static int number_of_boxes;
    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
        number_of_boxes++;
    }
    public double find_volume(){
        return this.length * this.width * this.height;
    }
}
public class class_and_obj_intro
{
	public static void main(String[] args) {
	    Box a = new Box(2, 3, 4);
		System.out.println(a.find_volume());
		System.out.println(Box.number_of_boxes);
	}
}