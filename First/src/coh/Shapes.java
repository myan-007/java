package coh;


class Square{
	int s;
	int getArea() {
	return s*s;	
	}
	int getPerimeter() {
    return 4*s;
	}
}
class Rectangle{
	int l;
	int b;
	int getArea() {
	return l*b;	
	}
	int getPerimeter() {
    return 2*(l+b);
	}
}

public class Shapes {
 
	public static void main(String[] args) {
		
		Square s =new Square();
		s.s=30;
		System.out.println("Area ="+s.getArea());
		System.out.println("Perimeter ="+s.getPerimeter());
		
		Rectangle r = new Rectangle();
		r.b=3;
		r.l=4;
		System.out.println("Area ="+r.getArea());
		System.out.println("Perimeter ="+r.getPerimeter());
	}
}
