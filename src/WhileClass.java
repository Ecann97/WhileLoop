
public class WhileClass {

	public static void main(String[] args)
	{
		for(int i=1; i<10; i++)
		{
			while(i % 2 == 0)
			{
				
				System.out.println(i + " " + "Is divisible by 2.  ");
				
				System.out.println((i+1) + " " + "Is odd.  ");
				
				i = i+1;
			}
		}
	}
}
