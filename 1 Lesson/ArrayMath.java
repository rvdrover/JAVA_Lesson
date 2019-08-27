import java.util.*;
class ArrayMath
{
	static int arr[]={10, 5,26, 65,22};
	static int sumation()
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		return  sum;
	}
	static int maximum()
	{
		int max=0;
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i])
			max=arr[i];
		}
		return  max;
	}
	static int minimum()
	{
		int min=5;
		for(int i=0; i<arr.length; i++)
		{
			if(min>arr[i])
			min=arr[i];
		}
		return  min;
	}
	static int search()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Search Number");
		int num=sc.nextInt();
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i]==num)
			{
				System.out.print(num+" is Exit");
				break;
			}				
		}
		return num;
	}		
		
	public static void main(String[]args)
	{
		System.out.println("Summation of Array "+sumation());
		System.out.println("Maximum value of the Array "+maximum());
		System.out.println("Minimum value of the Array "+minimum());
		search();
	}
}