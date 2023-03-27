package sec07;

public class Array13MaxValue {

	public static void main(String[] args) {

		// 1. 배열 사용전
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;

		int max = 0;
		if (a > max);
		max = a;
		if (b > max);
		max = b;
		if (c > max);
		max = c;
		if (d > max);
		max = d;
		if (e > max);
		max = e;
		System.out.println("제일 큰 수 :" + max);
		
		
		
		
		max=0;
		int arr[] = {a,b,c,d,e};
		for (int ar : arr) {
			if(ar >max) {
				max=ar;
			}
		}
		System.out.println(max);
		
		
		max=0;
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			
		
		}
		
		System.out.println(max);
		
		
		
		
		
	}
}