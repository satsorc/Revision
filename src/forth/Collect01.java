package forth;

import java.util.ArrayList;
import java.util.List;

public class Collect01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("바나나");
		
		list.set(2, "포도");
		list.remove(4);
		

		for (String element : list)
			System.out.print(element + "\t");
		System.out.println();
		
		
		for(int i=0; i< list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		
		
		String ma = "Park JongHui";
		System.out.println(ma.length());
	}

}
