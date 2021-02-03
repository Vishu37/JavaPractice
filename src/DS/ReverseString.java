package DS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
	String name = "My name is Rajashree Swami Tomar";
//	reverseStringMethod(name);
	reverseStringMethod1(name);
	}

	private static void reverseStringMethod(String name) {
		String revName = "";
		int size  = name.length();
		for (int i = size-1; i >= 0; i--) {
			revName =  revName + name.charAt(i) ;
		}
		System.out.println(revName);
	}

	private static void reverseStringMethod1(String name) {
		String revName = "";
//		Stream.of(name).toArray((data) -> {
//			revName =  revName + data ;
//		});
		//List<> arr1 = new ArrayList();
//		System.out.println(revName);
	}
}
