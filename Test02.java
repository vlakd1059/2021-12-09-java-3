package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		int num = sc.nextInt();
		System.out.println("���('-')�� ���� >> " + dash(num));
	}

	public static int dash(int num) {

		int ten = 10; // 10��� ��Ʈ��
		int j = 0; // �ڸ��� ���� ����

		for (int i = 1; i <= num; i++) { //?
			if (num < ten) {
				//System.out.println(i);
				j = i;
				break;
			}
			ten = ten * 10;
		}
		// �迭�� �ԷµȰ��� �ݴ�� �ֱ�
		int[] arr = new int[j];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num % 10;
			num = num / 10;
		}
		// �迭�� �� ������ Ȯ��
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
		System.out.println();
		int sum = 0;
		// ���� �����
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 || arr[i] == 6 || arr[i] == 9) {
				sum = sum + 6;
			} else if (arr[i] == 1) {
				sum = sum + 2;
			} else if (arr[i] == 2 || arr[i] == 3 || arr[i] == 5) {
				sum = sum + 5;
			} else if (arr[i] == 4) {
				sum = sum + 4;
			} else if (arr[i] == 7) {
				sum = sum + 3;
			} else if (arr[i] == 8) {
				sum = sum + 7;
			}
		}
		return sum;
	}

}
