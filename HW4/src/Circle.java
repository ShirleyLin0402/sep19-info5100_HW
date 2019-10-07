public class Circle extends Shape{
	protected double radius;
	
	public Circle(double radius) {
		this.name="Circle";
		this.radius = radius;
	}
	
	public void getArea(){
		this.area= Math.PI * radius*radius;
		System.out.println(this.area);
		
	}
	
	public void getPerimeter() {
		this.perimeter = 2 *Math.PI*radius; 
		System.out.println(this.perimeter);
	}
	
	public void draw() {
		System.out.println("Drawing " + name);
	}

 
}
