package jspProject;

public class SamePackage {

	protected String sameVar = "같은 패키지는 허용"; //접근제어자 생략됨
    
    private String privateStr() {
    	return "기존private";
    }
    
    String defaultStr() {
    	return "기존default";
    }
    
    protected String protectedStr(){
    	return "기존protected";
    }

    public String publicStr() {
    	System.out.println("기존private출력");
    	System.out.println("해당 클래스의 sameVar변수값: "+sameVar);
    	return "기존public";
    }
}