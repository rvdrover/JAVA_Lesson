class TyVar
{
	static int regNo;
	int age;
	void calculateTotal()
	{
		float mark1=80,mark2=34,mark3=56,total;
		total=mark1+mark2+mark3;
		System.out.println("The total marks is "+total);
	}
	public static void main(String args[])
	{
		regNo=38;
		System.out.println("Registration no of the student is "+regNo);
		
		TyVar obj=new TyVar();
		obj.age=21;
		System.out.println("Age of the student is "+obj.age);
		
		obj.calculateTotal();
	}
} 
	