
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 자바문자열데이터1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		Document a = new Document().get();
//		Element e = a.ele.get();
		
		

		while(true) // 무한루프 => 종료하는 조건
		{
			System.out.println("================메뉴================");
			System.out.println("1. 뮤직 목록");
			System.out.println("2. 뮤직 검색");
			System.out.println("3. 종료");
			System.out.println("==================================");
			System.out.print("메뉴 선택 =>(목록 :1, 검색 :2, 종료 :3)");
			int menu = scan.nextInt();
			if(menu ==3)
			{
				break; //반복문 중단
			}
			else if(menu ==1)
			{
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); //웹사이트 연결
				Elements title = doc.select("a.title");
				for(int i=0;i<50;i++)
				{
					System.out.println((i+1)+". "+title.get(i).text());
				}
			}
			else if(menu ==2)
			{
				System.out.print("검색어 입력");
				String fd = scan.next();
				
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); //웹사이트 연결
				Elements title = doc.select("a.title");
				
				for(int i=0;i<50;i++)
				{
					if(title.get(i).text().contains(fd))
					{
					System.out.println((i+1)+". "+title.get(i).text());
					}
				}
			}
			else // default => (1,2,3)외의 다른 번호를 선택시 처리하는 문장
			{
				System.out.println("메뉴를 선택하세요");
			}
			
		}
		
		System.out.println("프로그램 종료");
	}

}
