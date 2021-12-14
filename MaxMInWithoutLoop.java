package MaxMin;

public class MaxMInWithoutLoop {

	public static void main(String[] args) {
		
		int a[]= {5,7,6,1,0,8,9};
		
		int largest = Integer.MIN_VALUE; //-2147483648
	
		int second_largest = Integer.MIN_VALUE; //-2147483648
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				second_largest=largest;
				largest=a[i];
			}else if(a[i]>second_largest && a[i]!=largest)
			{
				second_largest=a[i];
			}
						
		}
		System.out.println(+second_largest);

	}

}
