class Member
{
	String Name;
	int Age;
	int Phnum;
	String Address;
	int Salary;
	
	
	void printDetails()
	{
		System.out.println("Name "+Name+"\nAge "+Age+"\nPhone number "+Phnum+"\nAddress "+Address+"\nSalary"+Salary+"\n");
	}
}
	class Employee extends Member
	{
		String specialization;
		void spec()
		{
			System.out.println("Specialization "+specialization);
		}
	}
	
	class Manager extends Member
	{
		String department;
		void dep()
		{
			System.out.println("Department "+department);
		}
	}
class Mem
{
	public static void main(String args[])
	{
		Employee obj1=new Employee();
	
		obj1.Name="Ravindu";
		obj1.Age=30;
		obj1.Phnum=075234535;
		obj1.Address="567/new town,negombo";
		obj1.Salary=300000;
		obj1.specialization="xyzy";
		obj1.spec();
		obj1.printDetails();
		
		
		
		Manager obj2=new Manager();
		
		obj2.Name="Dimuthu";
		obj2.Age=45;
		obj2.Phnum=0752354535;
		obj2.Address="34/new town";
		obj2.Salary=300000;
		obj2.department="xxxx";
		obj2.dep();
		obj2.printDetails();
		
	}
}
		
		
