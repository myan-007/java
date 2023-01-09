package coh;
class Circle{
	int r;
	
}
class Cylinder extends Circle{
	int h;
	double getArea() {
		double a;
		a=2*Math.PI*r*(r+h);
		return a;
	}
}
public class Shapes2 {
public static void main(String[] args) {
	Cylinder c = new Cylinder();
	c.r=3;
	c.h=6;
	System.out.println(c.getArea());
}
}
