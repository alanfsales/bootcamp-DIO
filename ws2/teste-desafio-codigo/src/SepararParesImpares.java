import java.util.*;
import java.util.Scanner;

public class SepararParesImpares {
    public static void main(String args[]) {
          
		Scanner input = new Scanner(System.in);
		int i, a, j;
		int N = input.nextInt();
		int[] nums = new int[N];
		
		for (i = 0; i < N; i++) {
			nums[i] = input.nextInt();
		}
		
		for (i = 0; i < N; i++) {
			if (nums[i] % 2 != 0) {
				 for (j = (i + 1); j < N; j++) {
					 if (nums[j] % 2 == 0) {
						 a = nums[i];
						 nums[i] = nums[j];
						 nums[j] = a;
						 j = N;
					 }
				 }
			}
		}

		for (i = 0; i < N; i++) {
            System.out.println(nums[i]);
        }
  }
}