package array2_190110_Thursday;

import java.math.BigInteger;

public class SumTest {
	
	
	
	public static int fibor(int n) {
//		if(n ==0 )
//			return 0;
//		if(n==1)
//			return 1;
		if(n==0 || n== 1) return n;
		
		return fibor(n-1)+fibor(n-2);
	
	}
	public static BigInteger fac(int n) {
		BigInteger result = BigInteger.ONE;
		for(int i = 1; i<=n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
	
	public static BigInteger facr(BigInteger n) {
		if(n==BigInteger.ONE)
			return new BigInteger("1");
//		return n*facr(n-1);
		return n.multiply(facr(BigInteger.valueOf(n.longValue()-1)));
	}
	
	public static int sumr(int n) {
		if(n==1)
			return 1;
		
		return n+sumr(n-1);
	}
	
	public static int sum(int n) {
		int sum = 0;
		for(int i = 1; i<=n; i++)
			sum +=i;
		return sum;
	}
	
	public static int gcd(int a, int b) {
//		if(a<b) {
//			int temp =a;
//			a = b;
//			b = temp;
//		}
		
		if(b == 0)
			return a;
		
		return gcd(b, a%b);
		
		
	}
	
	public static void main(String[] args) {
//		System.out.println(facr(new BigInteger("100")));
//		System.out.println(fac(100));
//		System.out.println(fibor(60));
		System.out.println(gcd(6, 16));
	}
}
