import java.util.Scanner;

public class 자바5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] priceStr = { "오만원권 %d매", "만원권 %d매", "천원권 %d매", "100원 %d개", "50원 %d개", "10원 %d개", "1원 %d개" };
		int[] price = { 50000, 10000, 1000, 100, 50, 10, 1 };
		int number;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오");
		number = scan.nextInt();
		for (int i = 0; i < price.length; i++) {
			System.out.printf(priceStr[i] + "\n", number / price[i]);
			number = number % price[i];
		}

	}
}