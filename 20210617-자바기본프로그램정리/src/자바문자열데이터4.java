/*
 *   int indexOf(문자)
 *   Hello Java
 *   0123456789
 *   
 *   indexOf('o') ==> 4
 *   indexOf('a') ==> 7		==> 확장자 a.java
 *   // 처음부터 찾기 =>
 *   lastIndexOf('a') => 뒤에서 찾기 ==> 9 ==> \\, / 경로명
 * 
 * 
 * 
 *  
 *  	서울특별시 서초구 신반포로45길 50-9 유진빌딩 지번 서울시 서초구 잠원동 35-8 유진빌딩
 *		
 * 
 * 
 */
public class 자바문자열데이터4 {
	public static void main(String[] args) {
		String a = new String("서울특별시 서초구 신반포로45길 50-9 유진빌딩 지번 서울시 서초구 잠원동 35-8 유진빌딩");
		String first = a.substring(0,a.indexOf('지'));
		System.out.println(first);
		
		String second = a.substring(a.indexOf('번')+1);
		System.out.println(second.trim());
		;
	}
}
