/*
 * 1.	Scanner Ŭ������ �̿��Ͽ� 2�ڸ��� ����(10~99����)�� �Է¹ް�,
		���� �ڸ��� 1�� �ڸ��� ���� �� �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.

���)
      2�ڸ��� ���� �Է�(10~99) >> 77 
10�� �ڸ��� 1�� �ڸ��� �����ϴ�.

 */

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a =0;
		while(true)
		{
			System.out.print("���� �Է� (10~99) >>");
			a = scan.nextInt();
			if(a<10 && a >99)
			{
				System.out.print("���ڸ��� �ٽ��Է��Ͻÿ�");
				continue;
			}
			break;
		}
		
		if(a%11==0)
		{
			System.out.println("10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}else
		{
			System.out.println("10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		
		
	}

}
