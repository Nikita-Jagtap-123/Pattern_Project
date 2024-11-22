package pattern;

public class PattenProj {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)//outer for loop -> no. of rows
		{
			for(j=1;j<=5;j++)//Inner for loop -> no. of columns
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
