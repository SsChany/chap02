package sec03;

public class StringClassTest {

	public static void main(String[] args) {

		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println("str1 hashcode :" + System.identityHashCode(str1));
		System.out.println("str2 hashcode :" + System.identityHashCode(str2));
		System.out.println("str3 hashcode :" + System.identityHashCode(str3));
		
		if(str1 == str2) {
			System.out.println("str1과 str2의 번짓수는 같다.");
		}
		if(str1 == str3) {
			System.out.println("str1 == str3 true");
		}else {
			System.out.println("str1 == str3 false");
		}
		
		if(str1.equals(str3))
			System.out.println("str1과 str3가 갖고 있는 값은 같다.");
		else
			System.out.println("str1과 str3가 갖고 있는 값은 다르다.");
		
		
	}
}
