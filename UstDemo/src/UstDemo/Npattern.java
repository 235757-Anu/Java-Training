package UstDemo;

public class Npattern {
	public static void main(String[] args) {
		int i;
		for(i=1;i<=7;i++)
		{
			if(i==3)
			{
				System.out.println((i+1)+""+(i+1)+"");
				i=i+1;
				System.out.println();
				
				}
			else
			{
				System.out.println(""+i+""+(i+1));
				System.out.println();
			}
		}
	}

}
