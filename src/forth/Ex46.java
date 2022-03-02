package forth;

//41
//class Ex46 {
//	public static void main(String args[]) {
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(0 / 0); //Error 발생 
//			System.out.println(4); // 에러난 이후에는 실행되지 않는다.
//		} catch (ArithmeticException ae) {
//		System.out.println(ae);
//
//
//			System.out.println(5);
//		}
//	}
//}
//
//
//42
//class Ex46 {
//	public static void main(String args[]) {
//		try {
//			String c = null;
//			System.out.println(" 문자열 값은 :  " + c.toString());
//		} catch (NullPointerException e) {
//			System.out.println("예외가 발생하여 Exception 객체가 잡음");
//			System.out.println(e);
//		}
//		System.out.println("정상 종료");
//	}
//}
//
//43
//class Ex46 {
//	public static void main(String args[]) {
//		try {
//			System.out.println("매개변수로 받은 두 개의 값");
//			int a = Integer.parseInt(args[0]); // 문자열 값을 정수로 변환
//			int b = Integer.parseInt(args[1]);
//			System.out.println(" a = " + a + " b = " + b);
//			System.out.println(" a를 b로 나눈 몫 = " + (a / b));
//			System.out.println("나눗셈 수행");
//		} catch (ArithmeticException e) {
//			System.out.println("==================================");
//			System.out.println("ArithmeticException 처리 루틴 : ");
//			System.out.println(e + " 예외 발생");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("==================================");
//			System.out.println("ArrayIndexOutOfBoundsException 처리 루틴");
//			System.out.println(e + " 예외 발생");
//		} catch (NumberFormatException e) {
//			System.out.println("==================================");
//			System.out.println("NumberFormatException 처리 루틴");
//			System.out.println(e + " 예외 발생");
//		} finally {
//			System.out.println("==================================");
//			System.out.println("finally 블럭 수행");
//		}
//	}
//}
//
//
//44
//class Ex46 {
//	public static void main(String args[]) {
//		try {
//			System.out.println("매개변수로 받은 두 개의 값");
//			int a = Integer.parseInt(args[0]); // 문자열 값을 정수로 변환
//			int b = Integer.parseInt(args[1]);
//			System.out.println(" a = " + a + " b = " + b);
//			System.out.println(" a를 b로 나눈 몫 = " + (a / b));
//			System.out.println("나눗셈 수행");
//		} catch (Exception e) {
//			System.out.println("==================================");
//			System.out.println("Exception 관련 모든 예외 처리 루틴 : ");
//			System.out.println(e + " 예외 발생");
//		} finally {
//			System.out.println("==================================");
//			System.out.println("finally 블럭 수행");
//		}
//	}
//}
//
//
//45
//class Ex46 {
//	public static void main(String args[]) {
//		try {
//			String c = null;
//			System.out.println(" 문자열 값 :  " + c.toString());
//		} catch (Exception e) {
//			System.out.println(" >> 예외처리 구문 <<");
//			System.out.println(" >> e << ");
//			System.out.println(e);
//			System.out.println(" >> e.toString() << ");
//			System.out.println(e.toString());
//			System.out.println(" >> e.getMessage() <<");
//			System.out.println(e.getMessage());
//			// 발생한 예외 클래스의 인스턴스에 저장된 메시지 얻어오기
//			System.out.println(" >> e.printStackTrace() <<");
//			e.printStackTrace();
//			// 예외 발생 당시의 호출 스택에 있는 메소드의 정보와 예외 메시지를 화면에 출력
//		}
//	}
//}
//
//
//
//46
//class Ex46 {
//	public static void main(String[] args) {
//		
//		try  {
//				method1();		
//		} catch (Exception e)	{
//				System.out.println("main 에서 예외 처리");
//				e.printStackTrace();
//		}
//	}
//
//	static void method1() throws Exception {
//		throw new Exception(); // 예외를 고의로 발생시킴
//	}
//}