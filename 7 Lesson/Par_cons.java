class Par_cons
{
	int modelYear;
	String modelName;
	
	Par_cons(int modelYear,String modelName)
	{
		this.modelYear=modelYear;
		this.modelName=modelName;
	}
	
	public static void main(String args[])
	{
		Par_cons myCar=new Par_cons(1969,"Mustang");
		System.out.println(myCar.modelYear+" "+myCar.modelName);
	}
}