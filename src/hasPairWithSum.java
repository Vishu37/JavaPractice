import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//hasPairWithSum2([6,4,3,2,1,7], 9)
public class hasPairWithSum {

	public static void main(String[] args) {
		int[] in = {6,4,1,7};
		int sum  = 13;
	//	System.out.println(hasPairWithSum1(in, sum));
		System.out.println(hasPairWithSum2(in, sum));

	}

	private static boolean hasPairWithSum1(int[] in, int sum) {
		for (int i = 0; i < in.length -1; i++) {
			for (int j = i+1; j < in.length; j++) {
				if (in[i] + in[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}
	
	private static boolean hasPairWithSum2(int[] in, int sum) {
		Set<Integer> arr1 = new HashSet();		
		for (int i = 0; i < in.length; i++) {
			
			if(arr1.contains(in[i])) {
				return true;
			}
			arr1.add(sum-in[i]);
			
		}
		return false;
	}

}
