/*
 *    charAt(int) : ���ڿ��߿� �����Ѱ��� ���� ==> char
 *    
 *    String s= "Hello Java!!";
 *     Hello Java!!		===> �迭����(���۹�ȣ�� 0���� ����)
 *     01234567891011
 *     
 *     charAt(0) => 'H'
 *     charAt(6) => 'J'
 *     charAt(4) => 'o'
 */

import java.util.Scanner;

public class �ڹٹ��ڿ�������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s= "Hello Java!!";
		System.out.println("ù��° ���� : "+s.charAt(0));
		System.out.println("������° ���� : "+s.charAt(6));
		System.out.println("�ϰ���° ���� : "+s.charAt(7));*/
		// 1. �Է°� �ޱ� => �޸𸮿� ����
		Scanner scan =new Scanner(System.in);
		System.out.print("���ĺ� ������ �Է� :");
		String data = scan.next();
		System.out.println("���� ������ : "+data);
		// 'a' , 'A'
		int count=0;
		for(int i=0; i<data.length();i++)
		{
			char c= data.charAt(i);// �Էµ� ���ڿ����� ���� �Ѱ��Ӥ� ������´�.
//			System.out.println(c);
			if(c=='A' || c=='a')
				count++;
		}
		System.out.println("A,a�� � :"+ count);
	}

}
