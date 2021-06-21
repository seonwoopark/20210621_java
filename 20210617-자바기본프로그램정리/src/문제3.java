import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12) >> ");
		int a = scan.nextInt();
		switch(a)
		{
		case 3:case 4:case 5:
			System.out.println("봄");
		case 6:case 7:case 8:
			System.out.println("여름");
		case 9:case 10:case 11:
			System.out.println("가을");
		case 12:case 1:case 2:
			System.out.println("겨울");
		}
		
		if(a>2&&a<6)
		{
			System.out.println("봄");
		}else if(a>5 &&a<9)
		{
			System.out.println("여름");
		}else if(a>8 &&a<12)
		{
			System.out.println("가을");
		}else if(a>11 &&a<3)
		{
			System.out.println("겨울");
		}
	}

}
