import java.util.Arrays;

public class �迭Ȱ��_�ߺ����³��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] lotto =new int[10];
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*10)+1;//1~45������ ���� ���� ����
		}
		
		System.out.println(Arrays.toString(lotto));
		*/
		int[] com =new int[10];
		boolean bCheck=false;
		/*
		 *    bCheck => false => com�迭 ����
		 *              true  => ������ �ٽ� �߻� (�ߺ��� ���°��)
		 * 
		 */
		int rand=0;
		
		for(int i=0;i<com.length;i++)
		{
			bCheck= true;
			while(bCheck) 
			{
				rand=(int)(Math.random()*45)+1;
				bCheck=false; // fpr, while���� ������ ó������ ����
				for(int j=0;j<i;j++)
				{
					if(com[j]==rand)
					{
						bCheck=true;
						break;
					}
				}
			}
			//while ���ᰡ �Ǹ� �ߺ��� ����.
			com[i]=rand;
		}
		System.out.println(Arrays.toString(com));
	}
	
}
