//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]:
//It should return 1

//Given an array = [2,3,4,5]:
//It should return undefined

//Bonus... What if we had this:
// [2,5,5,2,3,5,1,2,4]
// return 5 because the pairs are before 2,2

package DS;

import java.util.HashMap;
import java.util.Map;

public class firstRecurringCharacterEx {

	public static void main(String[] args) {
	// 	int[] input = {2,5,1,2,3,5,1,2,4}; another way to initialize array
		int[] input;
	//	input =  new int[]{2,5,1,2,3,5,1,2,4};
	//	input =  new int[]{2,1,1,2,3,5,1,2,4};
		input =  new int[]{2,5,5,2,3,5,1,2,4};
//		input =  new int[]{2,3,4,5};
		firstRecurringCharacter2(input);

	}

	private static void firstRecurringCharacter(int[] in) {
		Map<String,Integer> map = new HashMap();
		int found = 0;
		String foundKey = null;
		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in.length; j++) {
				if(in[i] == in[j] && i != j && !map.containsKey(in[i]+"")) {
					map.put(in[i]+"", j);
				}
			}
		}
		System.out.println(map);
		for (Map.Entry<String,Integer> entry : map.entrySet())  {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			if(found > entry.getValue() || found == 0) {
				found = entry.getValue();
				foundKey = entry.getKey();
			}
		}
            System.out.println(foundKey);
	}

	private static void firstRecurringCharacter2(int[] in) {
		Map<String,Integer> map = new HashMap();
		String foundKey = null;
		for (int i = 0; i < in.length; i++) {
			if(map.containsKey(in[i]+"")) {
				foundKey = in[i]+"";
				break;
			}
			map.put(in[i]+"",i);
		}
		System.out.println(foundKey);
	}

	
}
