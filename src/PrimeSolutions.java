import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lcc 957109587@qq.com
 * @version 2016��3��9�� ����9:00:43
 * @Description
 */
public class PrimeSolutions {
	static ArrayList<ArrayList<Integer>> rsList = new ArrayList<>();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList> okList = new ArrayList<>();
		PrimeSolutions primeSolutions = new PrimeSolutions();
		int runtimes = scan.nextInt();
		for (int i = 0; i < runtimes; i++) {
			int n = scan.nextInt();
			int num = scan.nextInt();
			okList.add(primeSolutions.primeSolution(n, num));
		}
		for (int j = 0; j < okList.size(); j++) {
			if (okList.get(j) == null) {
				System.out.println(0);
			} else {
				primeSolutions.outPut(okList.get(j));
			}
			if (j < okList.size() - 1) {
				System.out.println();
			}
		}
	}

	/** 
	* @Title: primeSolution 
	* @Description: �������߼�
	*/
	public ArrayList<ArrayList<Integer>> primeSolution(int n, int num) {
		ArrayList<Integer> arr = getAllPrimeNum(num);
		ArrayList<Integer> temp = getAllPrimeNum(n);
		ArrayList<ArrayList<Integer>> okList = new ArrayList<>();

		while (temp.size() < n) {
			temp.add(0);
		}
		if ((!isHasResult(arr, num, n)) && n > arr.size())
			return null;

		getCombination(arr, n, 0, temp, 0);
		for (ArrayList<Integer> rs : rsList) {
			if (isEquals(rs, num) && rs.size() == n) {
				okList.add(rs);
			}
		}
		return okList;
	}

	/** 
	* @Title: getCombination 
	* @Description: �ݹ�ȡ�ÿ��ظ�������
	* @throws 
	*/
	private void getCombination(ArrayList<Integer> arr, int n, int begin, ArrayList<Integer> rs, int index) {
		if (n == 0) {
			rsList.add(rs);
			return;
		}
		for (int i = 0; i < arr.size(); i++) {

			if (index == 0 || arr.get(i) >= rs.get(index - 1)) {
				rs.set(index, arr.get(i));
				getCombination(arr, n - 1, i + 1, clone(rs), index + 1);
			}
		}
	}

	/** 
	* @Title: clone 
	* @Description: ���List
	*/
	private ArrayList<Integer> clone(ArrayList<Integer> rs) {
		ArrayList<Integer> tocopy = new ArrayList<>();
		for (int num : rs) {
			int temp = num;
			tocopy.add(temp);
		}
		return tocopy;
	}

	/** 
	* @Title: isHasResult 
	* @Description: �ж��Ƿ��н������֮һ
	*/
	public boolean isHasResult(ArrayList<Integer> arr, int num, int n) {
		for (int temp : arr) {
			if (temp * n == num) {
				return true;
			}
		}
		return false;
	}

	/** 
	* @Title: isEquals 
	* @Description: �ж�arr�������ĺ��Ƿ����sum
	*/
	public boolean isEquals(ArrayList<Integer> arr, int sum) {
		int temp = 0;
		for (int num : arr) {
			temp += num;
		}
		return sum == temp;
	}

	/**
	 * @Description: �õ�������
	 */
	private ArrayList<Integer> getAllPrimeNum(int num) {
		ArrayList<Integer> primeNums = new ArrayList<>();
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i))
				primeNums.add(i);
		}
		return primeNums;
	}

	/**
	 * @Title: isPrimeNumber
	 * @Description: �ж��Ƿ�������
	 */
	public boolean isPrimeNumber(int number) {
		if (number <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * @Title: sort
	 * @Description: ���ĵ�������ѣ�hashCode()����ֱ������
	 */
	public void sort(ArrayList<ArrayList<Integer>> rs) {
		for (int i = 0; i < rs.size(); i++) {
			for (int j = i + 1; j < rs.size(); j++) {
				if (rs.get(i).hashCode() > rs.get(j).hashCode()) {
					ArrayList<Integer> temp = rs.get(i);
					rs.set(i, rs.get(j));
					rs.set(j, temp);
				}
			}
		}
	}

	/**
	 * @Description: ���ո�ʽ���rs
	 */
	public void outPut(ArrayList<ArrayList<Integer>> rs) {
		sort(rs);
		for (int i = 0; i < rs.size(); i++) {
			for (int temp : rs.get(i))
				System.out.print(temp + " ");
			System.out.println();
		}
	}
}
