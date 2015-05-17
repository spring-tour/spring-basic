package spring.core.xml_configuration;

public class Circle implements Shape{

	private double radius;
	
	public Circle(){
		System.out.println("Circle has been created!");
	}
	public Circle(double radius){
		this.radius = radius;
        System.out.println("Circle has been created radius = "+radius);
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Drawing Circle");
	}

	public void area() {
		System.out.println("Area = "+Math.PI*Math.pow(radius, 2));
		
	}
}
