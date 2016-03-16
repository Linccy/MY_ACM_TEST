import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @ClassName: BigExponentialAddition
 * @Description: 2^m + 2^n的精确值(每一笔输出在十进制2,000位以内)，每个caes输出完毕后请输出一个换行字元做为区隔
 * @author LCC
 * @date 2016年3月9日 下午8:35:25
 * 
 */
public class BigExponentialAddition {

	public static BigInteger bigExpoonential(int num1, int num2) {

		int poor = Math.abs(num1 - num2);
		int minNum = 0;
		BigInteger bigNum = BigInteger.valueOf(2);

		if (num1 < num2) {
			minNum = num1;
		} else {
			minNum = num2;
		}
		return bigNum.pow(minNum).multiply(bigNum.pow(poor).add(BigInteger.valueOf(1)));
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		ArrayList<BigInteger> rsList = new ArrayList<>();
		int runtimes = scan.nextInt();
		for (int i = 0; i < runtimes; i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			rsList.add(bigExpoonential(n, m));
		}
		for (BigInteger value : rsList) {
			System.out.println(value);
		}
	}

}
