/*
 * 
 *      ��������
 *      =====
 *      
 *      =====================================================================
 *                        ���� ���� (�޸�)          ���� ����                    ���� ������
 *      =====================================================================
 *      �ν��Ͻ�����                 => ��ü����                                  ���α׷� �����          Ŭ���� ��ü �������� ��� ����
 *                         new => �޸� ������ ���� ����
 *      =====================================================================
 *      ��������(��������)   => �����Ϸ��� class ������       ���α׷� �����          Ŭ���� ��ü �������� ��밡��
 *                         �ε����� ��� (java)
 *                   a.java ===== a. class ======����
 *                          javac           java
 *      =====================================================================
 *      ��������                      => �޼ҵ� ȣ��� ����              �޼ҵ尡 �����ϸ� �ڵ�����      
 *                                          �������
 *      =====================================================================
 * 
 *      �ν��Ͻ� ����
 *      class ClassName{
 *         �������� ������;
 *         �������� ������;
 *         static �������� ������;
 *         
 *         ������ �޼ҵ��()
 *         {
 *            ��������
 *         }
 *      }
 *      
 *      class ClassName{
 *         String name;
 *         void rint()
 *         {
 *             String name="�ڹ���" ===> stack ==> �������� �켱���� => �������
 *             system.out.println(this.name); this => �ڽ��� ��ü
 *         }
 *      }
 *      
 *      
 *      
 *      ==> ��ü (Ŭ���� ����)
 *              ====
 *               ����� ���� = ��������
 *               
 *               1) �ڹٿ��� �����ϴ� �������� (�⺻ ��������)
 *                  ������, �Ǽ���, ����, ������
 *               2) ���� ���������� �����Ѵ�. ==> class (���,�л�,��ȭ,����,����,������,ȸ��...)
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
		//Movie�� ������ ������ �޸� ���� ����
		Movie m1=new Movie(); // m1 => title, director,actor,genre,grade,isShow
		// �޸𸮿� ���ٽø��� ==> . m1.title (.: �ּ� ���� ������)
		// �ٸ� ��������(������ �ִ�)�� ��Ƽ� �ѹ��� �޸𸮿� ���� => �����ϱ� ���ϴ�.
		// ��ȭ���� 
		System.out.println("m1="+m1);
		m1.title="�߽�����";
		m1.director="��â��";
		m1.actor="������ , ������ , ���� , ��â�� , ����ȣ";
		m1.genre="������/���";
		m1.grade="15�� �̻�";
		m1.isShow=true;
		
		System.out.println("��ȭ��:" +m1.title);
		System.out.println("����:" +m1.director);
		System.out.println("���:" +m1.actor);
		System.out.println("�帣:" +m1.genre);
		System.out.println("���:" +m1.grade);
		System.out.println(m1.isShow==true ? "����":"��������");
		
		
		Movie m2=new Movie(); // m2 => title, director,actor,genre,grade,isShow
		// ���ο� �޸� ����(title, director,actor,genre,grade,isShow) ==> new�� ����ؼ� ����
		System.out.println("m2="+m2);
		m2.title="�߽�����";
		m2.director="��â��";
		m2.actor="������ , ������ , ���� , ��â�� , ����ȣ";
		m2.genre="������/���";
		m2.grade="15�� �̻�";
		m2.isShow=true;
	}

}
