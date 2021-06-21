import java.util.Arrays;
import java.util.Scanner;
public class 배열활용_야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com= new int[3];
		int[] user = new int[3];
		//1. 난수 3개 발생
		// = 난수를 저장하는변수
		int rand =0;
		// = 중복을 체크하는 변수 (false: 저장, true : 중복(다시 난수 발생))
		boolean bCheck= false;
		for(int i=0;i<3;i++)
		{
			bCheck=true;
			while(bCheck)
			{
				//난수 발생
				rand =(int)(Math.random()*9)+1;
				//중복이 안된경우 => while을 종료
				bCheck= false;
				//중복여부 확인
				for(int j=0;j<i;j++)
				{
					if(com[j]==rand) //배열안에 같은 수가 저장 되었다면 => 다시 난수를 발생한다. while = 조건식
					{
						bCheck=true;
						break;
					}
				}
				//중복여부 확인
				
				
			}
			//저장
			com[i]=rand;
		}
		//System.out.println(Arrays.toString(com));
		//2. 사용 입력
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			//입력요청
			System.out.print("세자리 정수 입력 : ");
			int input = scan.nextInt();
			//오류처리
			if(input<100 || input>999)
			{
				System.out.println("→ 세자리 정수만 입력해야 합니다.");
				//while(true)로 이동
				continue; //for => 증가식 , while => 조건식 => 처음부터 다시 실행
			}
			
			//user[]에 저장 ===> 389/100 ==>3
			user[0]=input/100; 
			user[1]=(input%100)/10; // 389%100 ==> 89/10 =>8
			user[2]=input%10; // 389%10 ==> 9
			
			// 오류 처리 => 같은 수 입력시 오류
			if(user[0]==user[1] || user[0]==user[2] || user[1] == user[2])
			{
			System.out.println("같은수는 입력할수 없습니다.");
			continue;
			}
			
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.out.println("0은 사용할수 없습니다.");
				continue;
			}
			// 비교
			int s=0,b=0;
			//s=> 같은수 +같은자리수 , b=> 같은 수 , 다른 자리에 존재
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j]) // 같은 수가 있고
					{
						if(i==j) //같은자리
							s++;
						else	 //다른자리일 경우
							b++;
					}
				}
			}
			// 힌트
			System.out.printf("Input Number : %d,Result :%dS-%dB\n",input,s,b);
			//종료
			if(s==3)
			{
				System.out.println("Game Over");
				break;
			}
			//user[]에 저장
		}
		//3. 비교
		//4. 힌트
		//5. 종료여부
	}

}
