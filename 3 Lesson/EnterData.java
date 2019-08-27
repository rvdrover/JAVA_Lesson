import java.util.Scanner;

class EnterData
{
	public static void main(String []args)
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Your Name");
	String name=input.nextLine();
	System.out.println("Enter Your School");
	String scl=input.nextLine();
	System.out.println("Enter Your Birthday");
	String dob=input.nextLine();
	System.out.println("Enter Your Weight");
	float weight=input.nextFloat();
	System.out.println("Enter Your Age");
	int age=input.nextInt();
	System.out.println("My Name is "+name);
	System.out.println("My Age is "+age);
	System.out.println("My School is "+scl);
	System.out.println("My Birthday is "+dob);
	System.out.println("My Weight is "+weight);
	}
}
	