package UstDemo;

public class Prime {

	public static void main(String[] args) {
		int n=100,i,count,j;
		for(i=2;i<=n;i++)
		{
			count=0;
			for(j=2;j<=i/2;j++) {
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.print(i+" ");
			}
		}
	}

}
