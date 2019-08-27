class Max
{
	public static void main(String args[])
	{
		
		Display();
	}
	static int Min(int x,int y)
	{
		int min;
		if (x>y)
		{
			min=y;
		}
		else
		{
			min=x;	
		}
		return min;
	}
	static int Max(int x,int y)
	{
		int max;
		if (y>x)
		{
			max=y;
		}
		else
		{
			max=x;
		}
		return max;
	}
	static void Display()
	{
	System.out.println("MIN "+ Min(30,56));
	System.out.println("MAX "+Max(40,20));
	
	}

}
		
