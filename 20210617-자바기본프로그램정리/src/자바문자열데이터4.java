/*
 *   int indexOf(����)
 *   Hello Java
 *   0123456789
 *   
 *   indexOf('o') ==> 4
 *   indexOf('a') ==> 7		==> Ȯ���� a.java
 *   // ó������ ã�� =>
 *   lastIndexOf('a') => �ڿ��� ã�� ==> 9 ==> \\, / ��θ�
 * 
 * 
 * 
 *  
 *  	����Ư���� ���ʱ� �Ź�����45�� 50-9 �������� ���� ����� ���ʱ� ����� 35-8 ��������
 *		
 * 
 * 
 */
public class �ڹٹ��ڿ�������4 {
	public static void main(String[] args) {
		String a = new String("����Ư���� ���ʱ� �Ź�����45�� 50-9 �������� ���� ����� ���ʱ� ����� 35-8 ��������");
		String first = a.substring(0,a.indexOf('��'));
		System.out.println(first);
		
		String second = a.substring(a.indexOf('��')+1);
		System.out.println(second.trim());
		;
	}
}
