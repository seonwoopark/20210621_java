import java.util.Arrays;

// ��õ ���α׷�
/*
 *    ��ȭ��õ
 */
public class �迭Ȱ��_�󵵼����ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*10); // 0~9���� ������ ����
		}
		System.out.println(Arrays.toString(arr));
		int[] count =new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]++;
		}
		for(int i=0;i<count.length;i++)
		{
			System.out.println(i+"�� ����: "+count[i]);
		}
	}

}
