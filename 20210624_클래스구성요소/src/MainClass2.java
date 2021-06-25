/*
 * 
 *      변수종류
 *      =====
 *      
 *      =====================================================================
 *                        변수 생성 (메모리)          변수 유지                    변수 사용범위
 *      =====================================================================
 *      인스턴스변수                 => 객체생성                                  프로그램 종료시          클래스 전체 영역에서 사용 가능
 *                         new => 메모리 공간을 따로 생성
 *      =====================================================================
 *      정적변수(공유변수)   => 컴파일러가 class 파일을       프로그램 종료시          클래스 전체 영역에서 사용가능
 *                         로드했을 경우 (java)
 *                   a.java ===== a. class ======실행
 *                          javac           java
 *      =====================================================================
 *      지역변수                      => 메소드 호출시 마다              메소드가 종료하면 자동으로      
 *                                          사라진다
 *      =====================================================================
 * 
 *      인스턴스 변수
 *      class ClassName{
 *         데이터형 변수명;
 *         데이터형 변수명;
 *         static 데이터형 변수명;
 *         
 *         리턴형 메소드명()
 *         {
 *            지역변수
 *         }
 *      }
 *      
 *      class ClassName{
 *         String name;
 *         void rint()
 *         {
 *             String name="박문수" ===> stack ==> 지역변수 우선순위 => 멤버변수
 *             system.out.println(this.name); this => 자신의 객체
 *         }
 *      }
 *      
 *      
 *      
 *      ==> 객체 (클래스 변수)
 *              ====
 *               사용자 정의 = 데이터형
 *               
 *               1) 자바에서 지원하는 데이터형 (기본 데이터형)
 *                  정수형, 실수형, 논리형, 문자형
 *               2) 직접 데이터형을 제작한다. ==> class (사원,학생,영화,음악,맛집,레시피,회원...)
 *               
 */
class Movie{
	String title;
	String director;
	String actor;
	String genre;
	String grade;
	boolean isShow;
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Movie에 설정된 변수의 메모리 저장 공간
		Movie m1=new Movie(); // m1 => title, director,actor,genre,grade,isShow
		// 메모리에 접근시마다 ==> . m1.title (.: 주소 접근 연산자)
		// 다른 데이터형(관련이 있는)을 모아서 한번에 메모리에 저장 => 관리하기 편리하다.
		// 영화제목 
		System.out.println("m1="+m1);
		m1.title="발신제한";
		m1.director="김창주";
		m1.actor="조우진 , 이재인 , 진경 , 지창욱 , 김지호";
		m1.genre="스릴러/드라마";
		m1.grade="15세 이상";
		m1.isShow=true;
		
		System.out.println("영화명:" +m1.title);
		System.out.println("감독:" +m1.director);
		System.out.println("배우:" +m1.actor);
		System.out.println("장르:" +m1.genre);
		System.out.println("등급:" +m1.grade);
		System.out.println(m1.isShow==true ? "상영중":"개봉예정");
		
		
		Movie m2=new Movie(); // m2 => title, director,actor,genre,grade,isShow
		// 새로운 메모리 공간(title, director,actor,genre,grade,isShow) ==> new를 사용해서 생성
		System.out.println("m2="+m2);
		m2.title="발신제한";
		m2.director="김창주";
		m2.actor="조우진 , 이재인 , 진경 , 지창욱 , 김지호";
		m2.genre="스릴러/드라마";
		m2.grade="15세 이상";
		m2.isShow=true;
	}

}
