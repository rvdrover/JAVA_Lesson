class Ex2
{

	void m()
	{
		System.out.println("hello m");
	}
	
	void n()
	{
		System.out.println("hello n");
		this.m();
	}
	public static void main(String args[])
	{
		Ex2 obj=new Ex2();
		obj.n();
		
	}
}