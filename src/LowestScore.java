import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LowestScore {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> classAB = new ArrayList<>();
		classAB.add(new ArrayList<Integer>());
		classAB.add(new ArrayList<Integer>());
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		LowestScore lowestScore = new LowestScore();
		int flag = 0;
		int lastnum = -1;
		int runTimes = scan.nextInt();

		for (int j = 0; j < runTimes; j++) {
			int runtime = scan.nextInt();
			for (int i = 0; i < runtime; i++) {
				int num = scan.nextInt();
				if (num > lastnum) {
					classAB.get(flag).add(num);
				} else if (num < lastnum) {
					flag = 1;
					classAB.get(flag).add(num);
				}
				lastnum = num;
			}
			String rs = lowestScore.getLowScore(classAB);
			classAB.get(0).clear();
			classAB.get(1).clear();
			lastnum = -1;
			flag = 0;
			System.out.println(rs);

		}
	}

	public String getLowScore(ArrayList<ArrayList<Integer>> classAB) {
		ArrayList<Integer> arr = new ArrayList<>();
		String rs = "";
		arr.addAll(classAB.get(0));
		arr.addAll(classAB.get(1));
		Collections.sort(arr);
		for (int i = 0; (i < arr.size() && i < 3); i++) {
			for (int n : classAB.get(0)) {
				if (n == arr.get(i)) {
					rs += "A";
				}
			}
			for (int m : classAB.get(1)) {
				if (m == arr.get(i)) {
					rs += "B";
				}
			}
		}

		return rs;
	}
}
