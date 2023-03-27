package sec07;

public class Array010Id {

	public static void main(String[] args) {
		int a = 80;
		int b = 75;
		int c = 90;
		
		int sum = 0;
		sum = a + b + c;
		
		double avg = sum / 3.0;
		//double avg = (double)sum /3;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("총점 :" + sum);
		
		System.out.println("1. 평균 :" + avg);
		System.out.printf("2. 평균 : %.2f \n", avg);
		System.out.println("3. 평균: " + Math.round(avg*100)/100.0);
		System.out.println();
		
	}

}
