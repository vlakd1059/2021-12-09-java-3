package �ڹ��׽�Ʈ;

public class Test01 {

	public static void main(String[] args) {
		int startValue = 2;
		int endValue = 1000;
		System.out.print(startValue + "~" + endValue + "���� ������ : ");
		getPerfectNumber(startValue, endValue);
		System.out.println();
	}

	public static void getPerfectNumber(int startValue, int endValue) {
		for (int i = startValue; i <= endValue; i++) { // 2~1000���� ���� ++;
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (i == sum) {
				System.out.print(sum + " ");
			}
		}

	}

}
