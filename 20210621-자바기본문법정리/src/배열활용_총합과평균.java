import java.util.Arrays;

public class �迭Ȱ��_���հ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =(int)(Math.random()*101); //0~100������ ������ ���� ����
		}
		// ����  ����� �� Ȯ��
		System.out.println(Arrays.toString(arr));
		
		int total=0;
		double avg =0.0;
		
		// �K���͸� �����ϴ� ���� �ƴ϶� �б� => for-each(�б� ����)=> +=
		for(int i:arr)
		{
			total+= i; // total = total +i
		}
		
		avg = total/5.0;
		
		System.out.println("���� :"+total);
		System.out.println("��� :"+avg);
	
	}

}
