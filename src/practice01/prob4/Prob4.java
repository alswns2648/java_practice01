package practice01.prob4;
import java.util.Scanner;

public class Prob4 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 문자열을 입력하세요 : ");
		String str = scanner.nextLine();
		char[] charArr = str.toCharArray();
		for(int i = 0; i < charArr.length; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print(charArr[j]);
			}
			System.out.println();	
		}
		
		scanner.close();
	}
}
