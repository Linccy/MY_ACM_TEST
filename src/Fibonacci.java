import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description: 在数学上,斐波那契数列是以递回的方法来定义: F(0)=0 F(1)=1 F(n) = F(n-1)+ F(n-2)
 *               (n≧2)
 * @author LCC
 * @date 2016年3月9日 下午8:57:58
 * 
 */
public class Fibonacci {
	public static int num = 1;

	public static int fibonacci(int num) {
		if (num == 1) {
			return 1;
		} else if (num == 0) {
			return 0;
		}
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> rsList = new ArrayList<>();
		int runtimes = scan.nextInt();
		for (int i = 0; i < runtimes; i++) {
			int n = scan.nextInt();
			rsList.add(fibonacci(n));
		}
		for (int value : rsList) {
			System.out.println(value);
		}
	}

}
