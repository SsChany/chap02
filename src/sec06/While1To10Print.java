package sec06;

public class While1To10Print {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println(i + "");
			i++;

		}

		while (true) {
			System.out.println(i + " ");
			i++;
			if (i > 10) {
				break;
			}
		}

	}
}
