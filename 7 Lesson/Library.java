class Book
{
	String BID,BName,Author;
	double Price;
	int No_of_pages;
	char Category;
	
	void assignData(String BID,String BName,String Author,double Price,int No_of_pages,char Category)
	{
		this.BID=BID;
		this.BName=BName;
		this.Author=Author;
		this.Price=Price;
		this.No_of_pages=No_of_pages;
		this.Category=Category;	
		
	}
	void display()
	{
			System.out.println("Book ID = "+BID);
			System.out.println("Book Name = "+BName);
			System.out.println("Author of Book = "+Author);
			System.out.println("Book Price = "+Price);
			System.out.println("No of Pages = "+No_of_pages);
	}
	
	void checkGroup()
	{
		
		if(Category=='B')
			System.out.println("Book Catogory is Biology");
		else if(Category=='M')
			System.out.println("Book Catogory is Mathematics");
		else if(Category=='C')
			System.out.println("Book Catogory is Commerce");
		else if(Category=='C')
			System.out.println("Book Catogory is Arts ");
		else
			System.out.println("Book Catogory is Others");
		
		
	}
}
class Library
	{
		public static void main(String args[])
		{
			Book book1=new Book();
			Book book2=new Book();
			
			book1.assignData("M12534","The Principles of Mathematics","Brtand Russel",2500,576,'M');
			book2.assignData("O8934","Many Mansions","Gina Cerminana",2000,304,'O');
			
			book1.display();
			book1.checkGroup();
			
			System.out.println();
			
			book2.display();
			book2.checkGroup();
			
			
			
		}
}
