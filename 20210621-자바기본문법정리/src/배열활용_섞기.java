import java.util.Arrays;

public class �迭Ȱ��_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =new int[10];
		// ���� ����(������ ����)
		for(int i=0; i< arr.length;i++)
		{
			//arr[i]=(int)(Math.random()*10); // 0~9����
			arr[i]=i;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<100;i++)
		{
			int no=(int)(Math.random()*10);//0~9
			int temp=arr[0];
			arr[0]=arr[no];
			arr[no]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
