package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {17,21,10,7,34,19};
		int temp,i;
		System.out.println("Numbers Before Sorting");
		for(i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Numbers After Sorting");
		for(i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}