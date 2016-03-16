
import java.util.ArrayList;
import java.util.Scanner;

public class Factorization {

	public static String Factorize(int n) {
		int key = 1;
		int exponent = 1;//初始指数为1
		String outPut = n + "=";
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (n > 1) {
			for (int i = 2; i <= n; i++) { // 从2开始除到本身，用于判断素数
				if (n % i == 0) { // 找到素数因子
					key = i;
					list.add(key); // 保存这个素数因子
					break;
				}
			}
			n = n / key; // 继续分解除以素数因子得到的商
		}

		for (int i = 0; i < list.size(); i++) {
			if (i != list.size() - 1)
				if (list.get(i) == list.get(i + 1)) {
					exponent++;
				} else {
					if (exponent != 1)
						outPut += list.get(i) + "^" + exponent + "*";
					else
						outPut += list.get(i) + "*";
					exponent = 1;
				}
			else
				outPut += list.get(i);
		}
		return outPut;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(Factorize(n));
	}
}
