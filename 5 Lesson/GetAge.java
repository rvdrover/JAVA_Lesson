import java.util.Scanner;
class GetAge
{
	public static void main(String[]args)
	{
	Scanner ag=new Scanner(System.in);
    System.out.println("Enter Age ");
    int age=ag.nextInt();	
	
	if(age<=18)
		System.out.println("User is 18 or younger ");
	else
		System.out.println("User is older than 18");
		
	}
}
		