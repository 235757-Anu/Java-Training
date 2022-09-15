package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {17,21,10,7,34,19};
		int i;
		System.out.println("Numbers Before Sorting");
		for(i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(i=0;i<a.length-1;i++)
		{
			int temp=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[temp])
				{
					temp=j;
				}
			}
			int small=a[temp];
			a[temp]=a[i];
			a[i]=small;
		}
		
		System.out.println("Numbers After Sorting");
		for(i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
