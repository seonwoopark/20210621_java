/*
 *    charAt(int) : 문자열중에 문자한개를 추출 ==> char
 *    
 *    String s= "Hello Java!!";
 *     Hello Java!!		===> 배열형태(시작번호가 0부터 시작)
 *     01234567891011
 *     
 *     charAt(0) => 'H'
 *     charAt(6) => 'J'
 *     charAt(4) => 'o'
 */

import java.util.Scanner;

public class 자바문자열데이터2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s= "Hello Java!!";
		System.out.println("첫번째 문자 : "+s.charAt(0));
		System.out.println("여섯번째 문자 : "+s.charAt(6));
		System.out.println("일곱번째 문자 : "+s.charAt(7));*/
		// 1. 입력값 받기 => 메모리에 저장
		Scanner scan =new Scanner(System.in);
		System.out.print("알파벳 여러개 입력 :");
		String data = scan.next();
		System.out.println("받은 데이터 : "+data);
		// 'a' , 'A'
		int count=0;
		for(int i=0; i<data.length();i++)
		{
			char c= data.charAt(i);// 입력된 문자열에서 문자 한개ㅣㄱ 가지고온다.
//			System.out.println(c);
			if(c=='A' || c=='a')
				count++;
		}
		System.out.println("A,a가 몇개 :"+ count);
	}

}
