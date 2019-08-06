package practice01.prob3;
import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 숫자를 입력하세요 : ");

		int number = scanner.nextInt();
		int even = 0;
		int odd = 0;

		for (int i = 0; i <= number; i++ ) {
			if (i % 2 == 0) {
				even += i;
			}else {
				odd += i;
			}
		}

		if (number % 2 == 0 ) {
			System.out.println(even);
		}else {
			System.out.println(odd);
		}
		scanner.close();
	}
}
