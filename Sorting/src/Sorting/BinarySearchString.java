package Sorting;

public class BinarySearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a= {"a","c","e","g","i","k","m"};
		String n="e";
		int low=0;
		int high=7;
		int mid=(low+high)/2;
		while(high>=low)
		{
			if(n.compareTo(a[mid])<0)
			{
				high=mid-1;
			}
			else if(a[mid]==n)
			{
				System.out.println("String '"+n+"' found at position "+(mid+1));
				break;
		    }
			else
			{
				low=mid+1;
			}
			mid=(low+high)/2;
		}
		if(low>mid)
		{
			System.out.println("String not Found");
		}

	}

}
