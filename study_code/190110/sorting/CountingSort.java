package array2_190110_Thursday;

import java.util.Arrays;

public class CountingSort {
	public static void main(String[] args) {
		int[] data = {0,4,1,3,1,2,4,1};
		/*int max = Arrays.stream(data).max().getAsInt();*/
		int[] c = new int[4+1];
		int[] temp = new int[data.length];
		
		//counting
		for(int i = 0; i<data.length; i++) {
			c[data[i]]++;
		}
		
		//accumulate
		for(int i = 1; i<c.length; i++)
			c[i] += c[i-1];
		
		//정렬
		for(int i = 0; i<data.length; i++) {
			c[data[i]]--;
			temp[c[data[i]]] = data[i];
		}
		System.out.println(Arrays.toString(temp));
	}
}
