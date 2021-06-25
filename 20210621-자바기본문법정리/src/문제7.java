import java.util.Arrays;

public class ¹®Á¦7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[10];
		int sum=0;
		for(int i=0; i<a.length;i++)
		{
			a[i]=(int)(Math.random()*10)+1;
			sum+=a[i];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println("Æò±Õ : "+sum/(double)10.0);
	}

}
