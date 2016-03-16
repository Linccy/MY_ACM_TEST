import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Lcc √∞≈›≈≈–Ú
 */ 
public class AgeSort {

	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		return list;
	}

	public static String toOutput(ArrayList<Integer> list) {
		String output = "";
		for (int num : list) {
			output += num;
		}
		output += "\n";
		return output;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String outPut = "";
		Scanner scan = new Scanner(System.in);
		int runtimes = 1;
		while ((runtimes = scan.nextInt()) != 0) {
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < runtimes; i++) {
				list.add(scan.nextInt());
			}
			bubbleSort(list);
			outPut += toOutput(list);
		}
		System.out.print(outPut);
	}
}
