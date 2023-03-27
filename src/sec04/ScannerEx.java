package sec04;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int a = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int b = scanner.nextInt();
		
		
		 System.out.println(a > b ? "A가 큽니다": "B가 큽니다");
		 
		 scanner.close();
		 
		 
	}
	
}