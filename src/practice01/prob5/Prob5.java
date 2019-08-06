package practice01.prob5;

public class Prob5 {
	public static void main (String args[]) {
		//		1부터 99까지 반복
		for (int i = 1; i < 100; i++) {
			int sib = i/10;
			int il = i%10;
			//			십의 자리가 3, 6, 9이거나, 일의 자리가 3, 6, 9 일때 i를 출력
			if (sib == 3 || sib == 6 || sib == 9 || il == 3 || il == 6 || il == 9)
				System.out.print(i + " ");
			//			십의 자리가 3, 6, 9일때 짝
			if (sib == 3 || sib == 6 || sib == 9)
				System.out.print("짝");
			//			일의 자리가 3, 6, 9일때 짝
			if (il == 3 || il == 6 || il == 9)
				System.out.print("짝");
			if (sib == 3 || sib == 6 || sib == 9 || il == 3 || il == 6 || il == 9)
				System.out.println();
		}
	}
}
