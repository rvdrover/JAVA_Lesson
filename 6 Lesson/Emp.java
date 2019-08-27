class Emp
{
	String name;
	int empid;
	int age;
	public static void main(String args[])
	{
		Emp emp1=new Emp();
		emp1.name="Ravindu";
		emp1.empid=1101;
		emp1.age=25;
		System.out.println("Name"+" "+emp1.name+ " ID"+" "+emp1.empid+ " Age"+" "+emp1.age);
		
		Emp emp2=new Emp();
		emp2.name="Ifra";
		emp2.empid=1102;
		emp2.age=23;
		System.out.println("Name"+" "+emp2.name+ " ID"+" "+emp2.empid+ " Age"+" "+emp2.age);
		
		Emp emp3=new Emp();
		emp3.name="Kamal";
		emp3.empid=1103;
		emp3.age=28;
		System.out.println("Name"+" "+emp3.name+ " ID"+" "+emp3.empid+ " Age"+" "+emp3.age);
		
	}
}