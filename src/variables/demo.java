package variables;

import java.util.ArrayList;

public class demo {

	public static void main(String args[]) {
		
		ArrayList<Integer> arr=new ArrayList<>();
		
		arr.add(10);
		arr.add(13);
		arr.add(20);
		arr.add(24);
		
		arr.remove(1);
		
		ArrayList<Integer> temp=new ArrayList<>();
		
		System.out.println(((ArrayList) temp).capacity());
		
	}
}
