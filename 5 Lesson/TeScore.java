import java.util.Scanner;
class TeScore
{
	public static void main(String[]args)
	{
	Scanner ts=new Scanner(System.in);
    System.out.println("Enter Test Score ");
    int tst=ts.nextInt();	
	
	if(tst>=90)
		System.out.println("Grade is A");
	else if(tst>=80)
		System.out.println("Grade is B");
	else if(tst>=70)
		System.out.println("Grade is C");
	else if(tst>=60)
		System.out.println("Grade is D");
	else
		System.out.println("Grade is F");
			
	}
}
		