/*
 *  replace / replaceAll
 *  =======   ==========���Խ�
 *            [A-Z], [a,z] => [A-za-z]
 *            [0-9 , [��-�R]
 *  �ѱ��� ����
 * 
 */
public class �ڹٹ��ڿ�������5 {
	public static void main(String[] args) {
		String s ="Hellow Java";
		System.out.println(s.replace('a', 'k'));
		System.out.println(s.replace("Hellow", "Hi"));
		String s1="Hello �ȳ��ϼ��� 1234";
		System.out.println(s1.replaceAll("[^A-Za-z]", ""));
		System.out.println(s1.replaceAll("[^0-9]", ""));
		System.out.println(s1.replaceAll("[^��-�R]", ""));
		
	}
}
