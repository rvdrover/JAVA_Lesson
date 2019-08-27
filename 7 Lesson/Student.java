class Student
{
String Name;
int Age;
double Avg_marks;

	Student(String Name,int Age,double Avg_marks)
	{
		this.Name=Name;
		this.Age=Age;
		this.Avg_marks=Avg_marks;
	}
	public static void main(String args[])
	{
		Student st=new Student("Aryan",32,75.5);
		System.out.println("NAME "+st.Name+"\nAGE "+st.Age+"\nAvarage Marks "+st.Avg_marks);
	}
}