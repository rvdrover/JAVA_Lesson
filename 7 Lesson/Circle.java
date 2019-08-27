class Circle
{
	
	static void Ci_area(double r)
	{
		double area=Math.PI*r*r*2;
		System.out.println("Circle Area "+area);
		
	}
	static void Ci_Peri(double r)
	{
		double p=2*Math.PI*r;	
		System.out.println("Circle Perimeter "+p);
	}

	public static void main(String args[])
	{
		
		
		Ci_area(7);
		Ci_Peri(7);
		Ci_area(14);
		Ci_Peri(14);
		
		
	}
}