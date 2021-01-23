
public class printArrayPair {

	public static void main(String[] args) {
		printArrayPairFuntn(new int[] { 1, 2, 3, 4, 5 });
	}

	private static void printArrayPairFuntn(int[] abc) {
		for (int i = 0; i < abc.length; i++) {
			for (int j = 0; j < abc.length; j++) {
				System.out.println(abc[i] + "," + abc[j]);
			}
		}
	}

}
