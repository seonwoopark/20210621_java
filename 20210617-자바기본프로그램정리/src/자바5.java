import java.util.Scanner;

public class �ڹ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] priceStr = { "�������� %d��", "������ %d��", "õ���� %d��", "100�� %d��", "50�� %d��", "10�� %d��", "1�� %d��" };
		int[] price = { 50000, 10000, 1000, 100, 50, 10, 1 };
		int number;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�");
		number = scan.nextInt();
		for (int i = 0; i < price.length; i++) {
			System.out.printf(priceStr[i] + "\n", number / price[i]);
			number = number % price[i];
		}

	}
}