import java.util.Scanner;
class MiNumUse
{
	public static void main(String[]args)
	{
		Scanner nm=new Scanner(System.in);
		System.out.println("Enter First Number ");
		int i=nm.nextInt();
		System.out.println("Enter Second Number ");
		int j=nm.nextInt();
		System.out.println("Enter Second Number ");
		int k=nm.nextInt();
	
	if(j>k&&i>k)
		System.out.println("Minimum Number it is "+k);
	else if(i>j&&k>j)
		System.out.println("Minimum Number it is "+j);
	else 
		System.out.println("Minimum Number it is "+i);
			
	}
}