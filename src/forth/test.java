package forth;


class Op{
	
	// 과목당 점수를 받을 멤버속성 (맴버변수 혹은 맴버객체, 메소드가 아닌 필드)* 배열 점수는 숫자 자료형으로
	
	private double[] iArr;
	private double total = 0;

	
	
	public double getAvg() {
		//평균값 구하기
		//전체 과목수를 모두 더한값/ 과목
//		avg = avg + 과목당 점수들; => avg += 과목당 점수들 
		for(double d : iArr) {
			total += d;
		}
		
		return total/ iArr.length; // 평균값 보내
	}

	public void setiArr(double[] iArr) {
		this.iArr = iArr;
	}
	
	
}


public class test {

	public static void main(String[] args) {
		Op one = new Op();
		
		double[] iArr = {90.0, 85.5, 70.0};
		one.setiArr(iArr);
		System.out.println(one.getAvg());

	}

}
