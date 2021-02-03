package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {4,1,4,5};
		int[] arr2 =  {7,2,5};
		mergeSortedArrayMethod(arr1 ,arr2);
	}

	private static void mergeSortedArrayMethod(int[] arr1, int[] arr2) {
		int[] com  = new int[arr1.length + arr2.length];
		int j =0;
		int k =0;
		for(int i=0;i<com.length;i++) {
			if(j < arr1.length) {
				com[i] = arr1[j];
			}
			if (j >= arr1.length) {
				com[i] = arr2[k];
				k++;
				if(k == arr2.length) {
					break;
				}
			}
			j++;
		}
		System.out.println(com);
//		List<Integer> newlist = new ArrayList();
//		for (int i = 0; i < com.length; i++) {
//			newlist.add(com[i]);
//		}
//		Collections.sort(newlist);
//		
//		System.out.println(newlist);
		

		for (int i = 0; i < com.length-1; i++) {
			for (int l = i + 1; l < com.length; l++) {
				if(com[i]>com[l]) {
					int temp = com[i];
					com[i] = com[l];
					com[l] = temp;
				}
			}
		}
		
		System.out.println(com);
			
	}
}
