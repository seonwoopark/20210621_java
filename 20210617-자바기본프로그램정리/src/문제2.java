import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"500000��","10000��","1000��","100��","50��","1��"};
		int[] num = {50000,10000,1000,100,50,1};
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ� >>");
		int a = scan.nextInt();
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]+":"+a/num[i]+"��");
			a=a%num[i];
		}
		
		
	}

}
