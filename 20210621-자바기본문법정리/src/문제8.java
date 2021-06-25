import java.util.Scanner;
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[]={"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int course1[]={95, 88, 76, 62, 55};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("과목이름 >> ");
		String a = scan.next();
		boolean b=true;
		
		for(int i=0;i<course.length;i++)
		{
			if(a.equals(course[i]))
			{
				System.out.println(course[i]+"의 점수는 "+course1[i]);
				b=false;
				break;
			}
			if(a.equals("그만"))
			{
				System.out.println();
				b=false;
				break;
			}
		}
		
		if(b==true)
			System.out.println("없는과목입니다.");
	}

}
