package third;

interface Drawable {
	int ab = 5; // interface는 상수만 올수있다. 그렇기에 final이 생략되어있다, Final int ab = 5;
	public abstract void draw();
}

abstract class Shape{
	public double res = 0;
	
	public Shape() {
		System.out.println("출력");
	}

	public abstract double area();
	
	public void printArea() {
		System.out.println( "면적은 " + res );
	}
}

class Rectangle extends Shape implements Drawable {
	public int w = 10, h = 10;

	@Override
	public double area() {
		res = w * h;
		return res;
	}

	public void draw() {
		System.out.println("사각형을 그리다.");
	}
}

public class Exam03 {
	public static void main(String[] args) {
		Rectangle ref = null;
		ref = new Rectangle();
		ref.area();
		ref.printArea();
		ref.draw();
		System.out.println("인터페이스 ab값: "+ref.ab);  
	}
}