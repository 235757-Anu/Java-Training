package Assessment;

public class Program20Pattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=1;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				if((i==4)&&(j==4) || (i==5)&&(j==5))
				{
					break;
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}
		
	}
 
}
