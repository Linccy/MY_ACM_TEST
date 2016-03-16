import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author lcc 957109587@qq.com
 * @version 2016年3月16日 下午8:26:22
 * @Description
 */
public class Kth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int runtimes = scan.nextInt();
		String rs = "";
		for (int k = 0; k < runtimes; k++) {
			ArrayList<Integer> arr = new ArrayList<>();
			for (int i = 0; i < 20; i++) {
				arr.add(scan.nextInt());
			}
			Collections.sort(arr);
			rs += arr.get(scan.nextInt()-1) + "\n";
		}
		System.out.print(rs);
	}
}
