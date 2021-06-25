// �Է°�
import java.util.Scanner;
public class �޷¸�������α׷� {
	static int year, month;
	static int[] lastDay= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Year : ");
		year = sc.nextInt();
		while(true) {
			System.out.print("Month(1~12) : ");
			month = sc.nextInt();
			if(month<1||month>12)
				System.out.println("�߸��� �� �Է��Դϴ�.");
			else break;
		}
	}
	
	static int week() {
		if(year%4==0 && year%100==0 || year%400==0)	lastDay[2]=29;
		else lastDay[2]=28;
		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400+1;
		for(int i=1;i<month;i++)
			total+=lastDay[i];
		return total%7;
	}
	
	static void printCalendar(int week) {
		System.out.printf("%d�⵵ %d��\n",year,month);
		String[] strWeek= {"��","��","ȭ","��","��","��","��"};
		for(int i=0;i<strWeek.length;i++)
			System.out.print(strWeek[i]+"\t");
		System.out.println("\n");
		
		for(int i=1;i<=lastDay[month];i++) {
			if(i==1)
				for(int j=0;j<week;j++)
					System.out.print("\t");
			System.out.printf("%2d\t",i);
			week=(week+1)%7;
			if(week==0)	System.out.println();
		}
	}
	
	static void calendar() {
		input();
		printCalendar(week());
	}
	
	public static void main(String[] args) {
		calendar();
	}


}
