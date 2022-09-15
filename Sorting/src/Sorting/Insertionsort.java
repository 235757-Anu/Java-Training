package Sorting;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {17,21,10,7,34,19};
		int temp,i,n;
		System.out.println("Numbers Before Sorting");
		for(i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int j=1;j<a.length;j++)
			{
				n=a[j];
				i=j-1;
				while((i>-1)&&a[i]>n)
				{
					a[i+1]=a[i];
					i--;
				}
				a[i+1]=n;
			}
		
		System.out.println("Numbers After Sorting");
		for(i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}


	}

}
