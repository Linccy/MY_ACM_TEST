import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lcc 957109587@qq.com
 * @version 2016年3月16日 下午8:55:36
 * @Description
 */
public class MaxBorderSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int runtimes = scan.nextInt();
		String rs = "";
		for (int k = 0; k < runtimes; k++) {
			int[] num = new int[10];
			for (int i = 0; i < 10; i++) {
				num[i] = scan.nextInt();
			}
			rs += max_sub(num, 10);
			if (k < runtimes - 1) {
				rs += "\n";
			}
		}
		System.out.print(rs);
	}

	static int max_sub(int a[], int size) {
		int max = 0;
		int temp_sum = 0;
		for (int i = 0; i < size; i++) {
			temp_sum += a[i];
			if (temp_sum > max) {
				max = temp_sum;
			} else if (temp_sum < 0) {
				temp_sum = 0;
			}
		}
		return max;
	}

}
