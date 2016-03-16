import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n) {
        if(n<=0) return false;
        long ln = n;
        Set<Long> set = new HashSet<Long>();
        
        while(ln<=Integer.MAX_VALUE) {
            if(set.contains(ln) ) return false; else set.add(ln);
            ln = digitSquare(ln);
            if(ln == 1) return true;
        }
        return false;
    }
    
    private static long digitSquare(long ln) {
        long sum = 0;
        while(ln!=0) {
            sum += Math.pow(ln%10, 2);
            ln /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		ArrayList<Boolean> results = new ArrayList<>();
		int runtimes = scan.nextInt();

		for (int i = 0; i < runtimes; i++) {
			results.add(isHappy(scan.nextInt()));
		}
		for (boolean state : results) {
			if (state)
				System.out.println("Happy");
			else
				System.out.println("Not Happy");
		}
	}
}