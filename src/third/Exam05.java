package third;

class Pa{
	public int i;
	public String s;
	
	public Pa() {
		System.out.println("Pa()생성자 실행");
		System.out.println("i값은 "+i+", s값은 "+s);
	}
	
	public Pa(int i, String s) {
		System.out.println("Pa(int i, String s)생성자 실행");
		this.i = i;
		this.s = s;
		System.out.println("i값은 "+i+", s값은 "+s);
	}
}

class Ch extends Pa {
	public int i;
	public String s;
	
	public Ch() {
		System.out.println("Ch()생성자 실행");
		System.out.println("i값은 "+i+", s값은 "+s);
	}
	
	public Ch(int i, String s) {
		super(2, "매개변수가 있는 생성자");
		System.out.println("Ch(int i, String s)생성자 실행");
		this.i = i;
		this.s = s;
		System.out.println("i값은 "+i+", s값은 "+s);
	}
	
	public Ch(String s, int i) {
		this();
		System.out.println("Ca디폴트생성자호출");
		this.i = i;
		this.s = s;
		System.out.println("s값은 "+s+", i값은 "+i);
	}
}

public class Exam05 {

	public static void main(String[] args) {
		Ch c = new Ch();
		System.out.println("======================\n\n");
		Pa p = new Ch();
		System.out.println("======================\n\n");
		
		Ch c1 = new Ch(7, "c1매개변수가 있는 생성자");
		System.out.println("======================\n\n");
		Pa p1 = new Ch(2, "p1매개변수가 있는 생성자");
		System.out.println("======================\n\n");
		Pa p2 = new Ch("p2개변수가 있는 생성자", 3);
		System.out.println("======================\n\n");
	}

}
