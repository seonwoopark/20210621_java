import java.util.Scanner;
public class ����8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[]={"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int course1[]={95, 88, 76, 62, 55};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�����̸� >> ");
		String a = scan.next();
		boolean b=true;
		
		for(int i=0;i<course.length;i++)
		{
			if(a.equals(course[i]))
			{
				System.out.println(course[i]+"�� ������ "+course1[i]);
				b=false;
				break;
			}
			if(a.equals("�׸�"))
			{
				System.out.println();
				b=false;
				break;
			}
		}
		
		if(b==true)
			System.out.println("���°����Դϴ�.");
	}

}
