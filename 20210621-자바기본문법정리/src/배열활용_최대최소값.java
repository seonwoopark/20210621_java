import java.util.Arrays;

public class �迭Ȱ��_�ִ��ּҰ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =new int[7];
		//�� ����
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int max=1;
		int min=100;
		
		for(int i:arr)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
	}

}
