import java.util.Scanner;
public class ����6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] a= new int[10];
		boolean c= true;
		int temp =0;
		System.out.print("������ �Է��ϼ��� :");

		while(c)
		{
			for(int i=0;i<a.length;i++)
			{
				temp= scan.nextInt();
				if(temp<0)
				{
					System.out.println("���� ������ �Է��ϼ���.");
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
