import java.util.Scanner;

public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12) >> ");
		int a = scan.nextInt();
		switch(a)
		{
		case 3:case 4:case 5:
			System.out.println("��");
		case 6:case 7:case 8:
			System.out.println("����");
		case 9:case 10:case 11:
			System.out.println("����");
		case 12:case 1:case 2:
			System.out.println("�ܿ�");
		}
		
		if(a>2&&a<6)
		{
			System.out.println("��");
		}else if(a>5 &&a<9)
		{
			System.out.println("����");
		}else if(a>8 &&a<12)
		{
			System.out.println("����");
		}else if(a>11 &&a<3)
		{
			System.out.println("�ܿ�");
		}
	}

}
