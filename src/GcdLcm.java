import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Lcc 求最大公约数
 */
public class GcdLcm {

	static int runtimes = 0;// 运行次数
	static int numA, numB;

	// 求最大公约数
	public static int gcdOf(int m, int n) {
		int r;

		while (n != 0) {
			r = m % n;
			m = n;
			n = r;
		}

		return m;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		runtimes = scan.nextInt();
		ArrayList<Integer> results = new ArrayList<>();
		for (int i = 0; i < runtimes; i++) {
			numA = scan.nextInt();
			numB = scan.nextInt();
			results.add(gcdOf(numA, numB));
		}

		for (Integer result : results) {
			System.out.println(result);
		}

	}
}