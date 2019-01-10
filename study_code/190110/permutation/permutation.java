package array2_190110_Thursday;

public class Permutation {
	public static void main(String[] args) {
		for(int i1 = 1; i1<=3; i1++) {
			for(int i2=1; i2<=3; i2++) {
				if(i2 == i1)
					continue;
				for(int i3=1; i3<=3; i3++) {
					if(i3 == i1 || i3 == i2)
						continue;
					System.out.println(i1+ " " + i2 + " " + i3);
				}
			}
		}
	}
	
	/*public static void main(String[] args) {
		int count = 0;
		for(int i1 = 1; i1<=6; i1++) {
			for(int i2=1; i2<=6; i2++) {
				if(i2 == i1)
					continue;
				for(int i3=1; i3<=6; i3++) {
					if(i3 == i1 || i3 == i2)
						continue;
					System.out.println(i1+ " " + i2 + " " + i3);
					count ++;
				}
			}
		}
		System.out.println(count);
	}*/
}
