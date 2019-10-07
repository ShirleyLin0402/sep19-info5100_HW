
public class Shape {
	protected String name;
	protected double perimeter, area;
	
	public Shape() {
		this.name = "Shape";
	}
	public void draw() {
		System.out.println("Drawing "+ name);
	}
}