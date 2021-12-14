package MaxMin;

public class DeleteEleFromArray {

	public static void main(String[] args) {
		
		int a[]= {10,50,90,70,806,60};
		
		int del_ele=806;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(del_ele==a[i])
			{
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
				count=count+1;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element deleted successfully");
			for(int i=0;i<a.length-1;i++)
			{
				System.out.print(a[i]+" ");
			}

		}
		
	}

}
 