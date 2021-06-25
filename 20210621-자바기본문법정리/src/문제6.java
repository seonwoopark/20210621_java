import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] a= new int[10];
		boolean c= true;
		int temp =0;
		System.out.print("정수를 입력하세여 :");

		while(c)
		{
			for(int i=0;i<a.length;i++)
			{
				temp= scan.nextInt();
				if(temp<0)
				{
					System.out.println("양의 정수를 입력하세여.");
					break;
				}
				a[i]=temp;
				c= false;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%3==0)
			{
				System.out.print(a[i]+"\t");
			}
		}
		
		
	}

}
