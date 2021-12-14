package MaxMin;

public class InsertintoArray {

	public static void main(String[] args) {
		int a[]= {20,60,80,90,40,30};
		
		int pos=3;
		int element=100;
		for(int i=a.length-1;i>pos-1;i--)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=element;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
 