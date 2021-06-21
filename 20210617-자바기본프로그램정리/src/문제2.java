import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"500000원","10000원","1000원","100원","50원","1원"};
		int[] num = {50000,10000,1000,100,50,1};
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >>");
		int a = scan.nextInt();
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]+":"+a/num[i]+"개");
			a=a%num[i];
		}
		
		
	}

}
