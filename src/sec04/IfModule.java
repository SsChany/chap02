package sec04;

import java.util.Scanner;

public class IfModule {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int a = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int b = scanner.nextInt();
		
	
		
		
			
		if (a>b) {
			System.out.println("첫번째 숫자가 큽니다");
		}else if (a<b) {
		System.out.println("두번째 숫자가 큽니다");
		}else {
			System.out.println("두 수가 같습니다");
		}
		 scanner.close();
		compareTwoNumber(a,b);
		
		}
		 
	
	private static void compareTwoNumber(int a, int b) {
		
		if (a>b) {
			System.out.println("첫번째 숫자가 큽니다");
		}else if (a<b) {
		System.out.println("두번째 숫자가 큽니다");
		}else {
			System.out.println("두 수가 같습니다");
		}
		 
		 
		}
	
	
	
	
	
	
	
	
	
	
}