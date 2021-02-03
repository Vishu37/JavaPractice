import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

// Given 2 arrays, create a function that let's a user know (true/false) whether these two arrays contain any common items
//For Example:
//const array1 = ['a', 'b', 'c', 'x'];
//const array2 = ['z', 'y', 'i'];
//should return false.
//-----------
//const array1 = ['a', 'b', 'c', 'x'];
//const array2 = ['z', 'y', 'x'];
//should return true.

// 2 parameters - arrays - no size limit
// return true or false

public class ContainsCommonItem {

	public static void main(String[] args) {
		String[] arr1 = {"a","b","c","x"};
		String[] arr2 = {"z","y","x"};
	//	System.out.println(containCommonItem(arr1, arr2));
	//	System.out.println(containCommonItem2(arr1, arr2));
		System.out.println(containCommonItem3(arr1, arr2));
		

	}

	private static boolean containCommonItem(String[] arr1, String[] arr2) {
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if (arr1[i].equals(arr2[j])) {
					return true;
				}
			}
		}
		return false;
	}
	
	private static boolean containCommonItem2(String[] arr1, String[] arr2) {
		Set<String> newArr1 = new HashSet<>();
		for (String arr : arr1) {
			newArr1.add(arr);
		}
		System.out.println(newArr1.toString());
		for (int i = 0; i < arr2.length; i++) {
			if (newArr1.contains(arr2[i])) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean containCommonItem3(String[] arr1, String[] arr2) {
		Set<String> newArr1 = new HashSet<>(Arrays.asList(arr1));
		return Stream.of(arr2).anyMatch(newArr1::contains);
	}

}
