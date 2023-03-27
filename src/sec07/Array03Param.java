package sec07;

public class Array03Param {

	public static void main(String[] args) {

		int[] intArr = { 80, 75, 90 };
		// 평균을 구해주는 메소드 호출
		double avg = getSum(intArr);

		System.out.printf("avg : %.2f", avg);// 인자(argument)로 배열을 전달
	}

	// 평균을 구해주는 메소드
	public static double getSum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			System.out.println(arr[i]);
		}

		double avg = (double) sum / arr.length;

		return avg;

	}

}
