package array2_190110_Thursday;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation2 {
	public static int n;
	public static int r;
	public static int caseCount;
	public static int data[];
	
	public static void permutation(int count) {
		//ArrayIndexBoundesOutOfException을 피하기 위해.
		//여기서 이제 코드가 들어가면된다.
		//그러면 전수조사가 가능해지게 된다.
		//if(count == n) {
		if(count == r) {
			caseCount++;
			System.out.println(Arrays.toString(data));
			return;
		}
		//i의 값이 값에 해당하는 것이고
		//count가 열에 해당.
		//중복 순열을 하기 위한.
		for(int i = 1; i<=n; i++) {
			data[count]=i;
			permutation(count+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 6; //sc.nextInt();
		r = 3; //sc.nextInt();
//		data = new int[n];
		data = new int[r];
		permutation(0);
		System.out.println(caseCount);
		sc.close();
	}
}
