package forth;



class SingleTon{
	private static SingleTon st = new SingleTon() ; // static (공유되어야함) private 해야함.
	
	private SingleTon() {};
	
	
	public static SingleTon getSt() { // singleton은 객체 생성을 막기때문에 여기에 스테틱을 붙여서 접근할수 있도록 한다.
		if(st == null) st = new SingleTon();
		return st;
	}
	
	public void getMess() {
		System.out.println("메소드 호출");
	}
	
}



public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(s);

	}

}
