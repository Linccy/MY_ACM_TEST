import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lcc �������Ķ��x��ĳһ����n����Լ���������򔵵Ŀ��̈́t�Qn��������
 */
public class PerfectNumber {

	/**
	 * @param num
	 * @return �õ����������ĺ�
	 */
	public static int getFactor(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {// ��������϶�С��num/2
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
