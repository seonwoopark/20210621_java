import java.util.Arrays;

public class 배열활용_중복없는난수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] lotto =new int[10];
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*10)+1;//1~45사이의 임의 정수 대입
		}
		
		System.out.println(Arrays.toString(lotto));
		*/
		int[] com =new int[10];
		boolean bCheck=false;
		/*
		 *    bCheck => false => com배열 저장
		 *              true  => 난수를 다시 발생 (중복이 없는경우)
		 * 
		 */
		int rand=0;
		
		for(int i=0;i<com.length;i++)
		{
			bCheck= true;
			while(bCheck) 
			{
				rand=(int)(Math.random()*45)+1;
				bCheck=false; // fpr, while문은 무조건 처음부터 수행
				for(int j=0;j<i;j++)
				{
					if(com[j]==rand)
					{
						bCheck=true;
						break;
					}
				}
			}
			//while 종료가 되면 중복이 없다.
			com[i]=rand;
		}
		System.out.println(Arrays.toString(com));
	}
	
}
