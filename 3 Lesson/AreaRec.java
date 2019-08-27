import java.util.Scanner;

class AreaRec
{
	public static void main(String []args)
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the length of Rectangle");
	double length=input.nextDouble();
	System.out.println("Enter the width of Rectangle");
	double width=input.nextDouble();
	double area=width*length;
	System.out.print("The Area of Rectangle "+area);	
	}
}
	