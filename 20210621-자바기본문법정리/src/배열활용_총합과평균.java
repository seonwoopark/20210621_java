import java.util.Arrays;

public class 배열활용_총합과평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =(int)(Math.random()*101); //0~100사이의 임의의 수를 대입
		}
		// 실제  저장된 값 확인
		System.out.println(Arrays.toString(arr));
		
		int total=0;
		double avg =0.0;
		
		// 덷이터를 변경하는 것이 아니라 읽기 => for-each(읽기 전용)=> +=
		for(int i:arr)
		{
			total+= i; // total = total +i
		}
		
		avg = total/5.0;
		
		System.out.println("총합 :"+total);
		System.out.println("평균 :"+avg);
	
	}

}
