
public class Rectangle extends Shape{
	protected double width, length;
	
	public Rectangle(double width, double length) {
		this.name ="Rectangle";
		this.width = width;
		this.length = length;
	}
	
	public void getArea(){
		this.area= width*length;
		System.out.println(this.area);
		
	}
	
	public void getPerimeter() {
		this.perimeter = 2 *(width+length); 
		System.out.println(perimeter);
	}
	
}
