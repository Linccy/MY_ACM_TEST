import java.util.ArrayList;
import java.util.Scanner;

public class Euler {

	// �����Լ��
	public static int gcdOf(int m, int n) {
		int r;

		while (n != 0) {
			r = m % n;
			m = n;
			n = r;
		}

		return m;
	}
	//ŷ������
	private static int euler(int n) {
		int euler = 0;
		for (int i = 1; i < n; i++) {
			if (gcdOf(i, n) == 1)
				euler++;
		}
		return euler;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> rsList = new ArrayList<>();
		int runtimes = scan.nextInt();
		for (int i = 0; i < runtimes; i++) {
			int n = scan.nextInt();
			rsList.add(euler(n));
		}
		for (int value : rsList) {
			System.out.println(value);
		}
	}
}
