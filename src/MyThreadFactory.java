import java.util.Arrays;

public class MyThreadFactory {
	// Character a='\uDC00';
	static void swap(String[] a, int m, int n) {
		if (a[m].compareTo(a[n]) > 0) {
			Object o = a[n];
			a[n] = a[m];
			a[m] = (String) o;
		}
	}

	public static void main(String[] args) {
		String[] as = { "fwe", "fwwef", "eewf", "afwe", "gew" };
		String a = "ew";
		String b = "few";
		swap(as, 1, 2);
		// System.out.println(a+" "+b);

		String sf = "123";
		// Arrays.sort(as);
		for (String t : as) {
			System.out.println(t);
		}

		// as.sort(a);
	}
}
