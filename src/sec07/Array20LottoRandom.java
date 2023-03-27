package sec07;

import java.util.Scanner;

public class Array20LottoRandom {

	public static void main(String[] args) {

		// 배열 선언 (6개 공간 담는 배열 선언 (공간확보)
		int[] numarr = new int[6];

		// 세트입력(Scanner) (Scanner -2byte)
		Scanner scanner = new Scanner(System.in); // System.in 1byte
		System.out.println("몇 세트의 난수를 발생시키겠습니다?");
		int set = scanner.nextInt();

		// while
		while (set > 0) {
			// 난수 발생 for
			for (int i = 0; i < numarr.length; i++) {
				// 난수 1~45
				numarr[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (numarr[j] == numarr[i]) { //중복 방지
						i = i - 1;
						break;
					}
				}
			}
			// 한 세트 출력 (향상된 for문)
			for (int i : numarr) {
				System.out.print(i + "\t");
			}
			System.out.println();
			set = set - 1; // 0

		}
		scanner.close();
	}
}
