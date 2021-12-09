package 자바테스트;

public class Test01 {

	public static void main(String[] args) {
		int startValue = 2;
		int endValue = 1000;
		System.out.print(startValue + "~" + endValue + "까지 완전수 : ");
		getPerfectNumber(startValue, endValue);
		System.out.println();
	}

	public static void getPerfectNumber(int startValue, int endValue) {
		for (int i = startValue; i <= endValue; i++) { // 2~1000까지 슷지 ++;
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
