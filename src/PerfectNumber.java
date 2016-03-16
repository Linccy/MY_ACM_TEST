import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lcc 完美數的定義為某一個數n等於自己以外的正因數的總和則稱n為完美數
 */
public class PerfectNumber {

	/**
	 * @param num
	 * @return 得到所有因数的和
	 */
	public static int getFactor(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {// 最大因数肯定小于num/2
			if (num % i == 0)
				sum += i;
		}
		return sum;
	}

	public static boolean isPerfectNumber(int num) {
		if (num == getFactor(num))
			return true;
		return false;
	}

	public static void main(String[] args) {
		ArrayList<Integer> result = new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int runtimes = scan.nextInt();
		for (int i = 0; i < runtimes; i++) {
			int num = scan.nextInt();
			if (isPerfectNumber(num))
				result.add(num);
		}
		for (int num : result) {
			System.out.print(num + " ");
		}

	}

}
