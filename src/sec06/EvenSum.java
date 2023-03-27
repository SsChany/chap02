package sec06;

public class EvenSum {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		int sum1 = 0;
		for (i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
			if (i % 3 == 0) {
				sum1 += i;
			}
		}
		System.out.println("1~10 짝수의 합 : " + sum);
		System.out.println("1~10 짝수의 합 : " + sum1);

	}

}
