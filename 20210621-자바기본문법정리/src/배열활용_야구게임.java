import java.util.Arrays;
import java.util.Scanner;
public class �迭Ȱ��_�߱����� {
	
	static int s=0,b=0,input;
	static Scanner scan = new Scanner(System.in);
	static int[] input()
	{

		int[] user = new int[3];
		//�Է¿�û
		System.out.print("���ڸ� ���� �Է� : ");
		input = scan.nextInt();
		//����ó��
		if(input<100 || input>999)
		{
			System.out.println("�� ���ڸ� ������ �Է��ؾ� �մϴ�.");
			//while(true)�� �̵�
			//for => ������ , while => ���ǽ� => ó������ �ٽ� ����
		}
		
		//user[]�� ���� ===> 389/100 ==>3
		user[0]=input/100; 
		user[1]=(input%100)/10; // 389%100 ==> 89/10 =>8
		user[2]=input%10; // 389%10 ==> 9
		
		// ���� ó�� => ���� �� �Է½� ����
		if(user[0]==user[1] || user[0]==user[2] || user[1] == user[2])
		{
		System.out.println("�������� �Է��Ҽ� �����ϴ�.");
		}
		
		if(user[0]==0||user[1]==0||user[2]==0)
		{
			System.out.println("0�� ����Ҽ� �����ϴ�.");
		}
		return user;
	}
	static int[] com()
	{
		int[] com= new int[3];
		//1. ���� 3�� �߻�
		// = ������ �����ϴº���
		int rand =0;
		// = �ߺ��� üũ�ϴ� ���� (false: ����, true : �ߺ�(�ٽ� ���� �߻�))
		boolean bCheck= false;
		for(int i=0;i<3;i++)
		{
			bCheck=true;
			while(bCheck)
			{
				//���� �߻�
				rand =(int)(Math.random()*9)+1;
				//�ߺ��� �ȵȰ�� => while�� ����
				bCheck= false;
				//�ߺ����� Ȯ��
				for(int j=0;j<i;j++)
				{
					if(com[j]==rand) //�迭�ȿ� ���� ���� ���� �Ǿ��ٸ� => �ٽ� ������ �߻��Ѵ�. while = ���ǽ�
					{
						bCheck=true;
						break;
					}
				}
				//�ߺ����� Ȯ��
				
				
			}
			//����
			com[i]=rand;
		}
		
		return com;
	}
	
	static void hint() {
		System.out.printf("Input Num : %d, Result : %ds - %db\n",input,s,b);
	}

	
	static void exit(int[] com) {
		System.out.println("Game Over!!"+"\n"+"�߻��� ���� : " + Arrays.toString(com));
	}

	static void compare(int[] user, int[] com) {
		s=b=0;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				if(com[i]==user[j])
					if(i==j)	s++;
					else	b++;
	}

	
	static void baseballgame()
	{
		int[] com = com();
		while(s!=3)
		{
			int[] user= input();
			compare(user,com);
			hint();
		}
		exit(com);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		baseballgame();
	}

}
