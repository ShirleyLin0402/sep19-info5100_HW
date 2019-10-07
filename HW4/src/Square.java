public class Square extends Shape{
	protected double side;
	
	public Square(double side) {
		this.name ="Square";
		this.side = side;
	}
	
	public void getArea(){
		this.area= side *side;
		System.out.println(this.area);
		
	}
	
	public void getPerimeter() {
		this.perimeter = 4 *side; 
		System.out.println(this.perimeter);
	}
	
}
